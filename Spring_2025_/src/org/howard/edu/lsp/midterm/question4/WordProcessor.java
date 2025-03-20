package org.howard.edu.lsp.midterm.question4;
import java.util.List;
/** Sources https://stackoverflow.com/questions/17342923/design-a-word-processor */
/**
 * A driver class to test the WordProcessor class with various test cases.
 */
public class WordProcessorDriver {
    /**
     * Main method to run test cases for the WordProcessor class.
     */
    public static void main(String[] args) {
        WordProcessor wp1 = new WordProcessor("This is a test with amazing results, amazing achievements!");
        List<String> longestWords1 = wp1.findLongestWords();
        System.out.println("Test 1 - Longest words: " + longestWords1); 
        
        WordProcessor wp2 = new WordProcessor("Java is a powerful  tool!");
        List<String> longestWords2 = wp2.findLongestWords();
        System.out.println("Test 2 - Longest words: " + longestWords2); 
        
        WordProcessor wp3 = new WordProcessor("Programming requires practice patience persistence");
        List<String> longestWords3 = wp3.findLongestWords();
        System.out.println("Test 3 - Longest words: " + longestWords3); 
        
        WordProcessor wp4 = new WordProcessor("    Extra   spaces    between    words    ");
        List<String> longestWords4 = wp4.findLongestWords();
        System.out.println("Test 4 - Longest words: " + longestWords4); 
        
        WordProcessor wp5 = new WordProcessor("A B C D E");
        List<String> longestWords5 = wp5.findLongestWords();
        System.out.println("Test 5 - Longest words: " + longestWords5); 
        
        WordProcessor wp6 = new WordProcessor("");
        List<String> longestWords6 = wp6.findLongestWords();
        System.out.println("Test 6 - Longest words: " + longestWords6); 
    }
}