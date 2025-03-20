/**
 * 
 */
package org.howard.edu.lsp.midterm.question2;

/**
 * 
 */
/**
 * Represents a book in a library.
 */
/**
 * Driver class to test the functionality of the Book class.
 * This class demonstrates the creation of Book objects and tests the
 * equals() and toString() methods.
 */
public class midterm_question_2 {
    
    /**
     * The main method that serves as the entry point for the program.
     * It creates Book objects and tests their functionality.
     */
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "*9780593239681*", 2020);
        
       
        System.out.println(book1.equals(book2)); 
        System.out.println(book1.equals(book3)); 
        
        
    }
}