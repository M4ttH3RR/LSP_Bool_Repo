package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ETLPipeline {
    public static void main(String[] args) {
        String inputFile = "data/products.csv";
        String outputFile = "data/transformed_products.csv";
        
        System.out.println("Looking for file at: " + Paths.get(inputFile).toAbsolutePath());
        
        System.out.println("Starting Extraction...");
        List<String[]> products = extract(inputFile);
        if (products.isEmpty()) {
            System.err.println("No valid data found in input file. Exiting.");
            System.exit(1);
        }
        System.out.println("Extraction Complete. Rows extracted: " + products.size());
        
        System.out.println("Starting Transformation...");
        List<String[]> transformedProducts = transform(products);
        System.out.println("Transformation Complete.");
        
        System.out.println("Starting Load...");
        load(outputFile, transformedProducts);
        System.out.println("ETL Process Completed Successfully!");
    }

    private static List<String[]> extract(String filePath) {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            reader.readLine(); 
            while ((line = reader.readLine()) != null) {
                line = line.trim(); 
                if (line.isEmpty()) {  
                    continue;
                }
                System.out.println("Processing line: " + line);
                String[] fields = line.split(",", -1); 
                if (fields.length == 4) {  
                    records.add(fields);
                } else {
                    System.err.println("Warning: Skipping malformed line -> " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error: Unable to read input file. Make sure 'products.csv' exists in the 'data' folder.");
            System.exit(1);
        }
        return records;
    }

    private static List<String[]> transform(List<String[]> products) {
        List<String[]> transformed = new ArrayList<>();
        transformed.add(new String[]{"ProductID", "Name", "Price", "Category", "PriceRange"}); 
        
        for (String[] product : products) {
            String id = product[0];
            String name = product[1].toUpperCase(); 
            double price = Double.parseDouble(product[2]);
            String category = product[3];
            
            
            if (category.equals("Electronics") && price <= 500) {
                price *= 0.9;
                price = Math.round(price * 100.0) / 100.0; 
            }

            
            if (category.equals("Electronics") && price > 500) {
                category = "Premium Electronics";
            }
            
            
            String priceRange = getPriceRange(price);
            
            transformed.add(new String[]{id, name, String.valueOf(price), category, priceRange});
        }
        return transformed;
    }

    private static String getPriceRange(double price) {
        if (price <= 10) return "Low";
        else if (price <= 100) return "Medium";
        else if (price <= 500) return "High";
        else return "Premium";
    }

    private static void load(String filePath, List<String[]> data) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath))) {
            for (String[] record : data) {
                writer.write(String.join(",", record));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error: Unable to write output file.");
        }
    }
}