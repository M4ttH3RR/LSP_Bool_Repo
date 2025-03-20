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
public class midterm_question_2 {
    /** The title of the book. */
    private String title;
    /** The author of the book. */
    private String author;
    /** The ISBN number of the book (a unique identifier). */
    private String ISBN;
    /** The year the book was published. */
    private int yearPublished;

    /**
     * Constructs a Book object with the specified title, author, ISBN, and year published.
     *
     * @param title       The title of the book.
     * @param author      The author of the book.
     * @param ISBN        The ISBN number of the book.
     * @param yearPublished The year the book was published.
     */
    public midterm_question_2(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The new author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Returns the ISBN number of the book.
     *
     * @return The ISBN number of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN number of the book.
     *
     * @param ISBN The new ISBN number of the book.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Returns the year the book was published.
     *
     * @return The year the book was published.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the year the book was published.
     *
     * @param yearPublished The new year the book was published.
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two Book objects are considered equal if they have the same ISBN and author.
     *
     * @param obj The reference object with which to compare.
     * @return {@code true} if this object is the same as the obj argument; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return ISBN.equals(other.ISBN) && author.equals(other.author);
    }

    /**
     * Returns a string representation of the Book object.
     *
     * @return A string representation of the Book object.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}

/**
 * Driver class to demonstrate the Book class.
 */
public class BookDriver {
    /**
     * Main method to execute the demonstration.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1);
    }
}