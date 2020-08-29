/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfBooks;
    private String nameOfAuthors;
    //since it should be a of 13 Digits
    private String isbnNumberOfBooks;

    public Book() {
        this.nameOfBooks = "MATHEMATICS";
        this.nameOfAuthors = "RD SHARAMA";
        this.isbnNumberOfBooks = "5639206778924";
    }

    public Book(String nameOfBooks, String nameOfAuthors, String isbnNumberOfBooks) {
        this.nameOfBooks = nameOfBooks;
        this.nameOfAuthors = nameOfAuthors;
        this.isbnNumberOfBooks = isbnNumberOfBooks;
    }
}
