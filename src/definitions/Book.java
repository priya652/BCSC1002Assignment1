//  Created by IntelliJ IDEA.
// *  User: PRIYA kumari (priya652)
// *  Date: 30/08/20
// *  File Name : Book.java
// *
package definitions;

import java.util.Objects;
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

    //creating the getter method for the fields
    public String getNameOfBooks() {
        return nameOfBooks;
    }

    //now,we will create setter method for every variable
    public void setNameOfBooks(String nameOfBooks) {
        this.nameOfBooks = nameOfBooks;
    }

    public String getNameOfAuthors() {
        return nameOfAuthors;
    }

    public void setNameOfAuthors(String nameOfAuthors) {
        this.nameOfAuthors = nameOfAuthors;
    }

    public String getIsbnNumberOfBooks() {
        return isbnNumberOfBooks;
    }

    public void setIsbnNumberOfBooks(String isbnNumberOfBooks) {
        this.isbnNumberOfBooks = isbnNumberOfBooks;
    }

    public String toString() {
        return "Name of Book:" + "" + this.nameOfBooks + "\n"
                + "Name of Author of Book:" + "" + getNameOfAuthors() + "\n"
                + "IsBN code Of the Book:" + "" + this.isbnNumberOfBooks + ",";
    }

    public void doCheckout() {
        System.out.println("THANK YOU FOR RENTING A BOOK.");
    }

    public void doReturn() {
        System.out.println("THANK YOU FOR RETURNING THE BOOK.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfBooks(), book.getNameOfBooks()) &&
                Objects.equals(getNameOfAuthors(), book.getNameOfAuthors()) &&
                Objects.equals(getIsbnNumberOfBooks(), book.getIsbnNumberOfBooks());
    }

    public int hashCode() {
        return Objects.hash(getNameOfBooks(), getNameOfAuthors(), getIsbnNumberOfBooks());
    }
}
