/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
public class Library {
    private Book[] booksCurrentlyAvailable;

    //created the constructor
    public Library() {
        this.booksCurrentlyAvailable = new Book[20];
        //        for (int i = 0; i < Book.length(); i++) {
        //
        //     }
        this.booksCurrentlyAvailable[0] = new Book("English", "R.K Narayan", "5457982872581");
        this.booksCurrentlyAvailable[1] = new Book("DBMS", "Ramez Elmasri", "228522265256639");
        this.booksCurrentlyAvailable[2] = new Book("OOPs", "Grady Booch" + "", "56257029460839");
    }

    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable.clone();
    }

    public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    @Override
    public String toString() {
        return Arrays.toString(booksCurrentlyAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksCurrentlyAvailable(), library.getBooksCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksCurrentlyAvailable());
    }

    /**
     * GOING TO CREATE A METHOD, SO THAT ANY ONE IS ABLE TO STORE THE
     * BOOKS IN THE LIBRARY,
     *
     * @addBooks TO STORE THE BOOKS IN
     */
    public void addBooks(String bookName) {
        System.out.println(bookName + ",is added Succesfully.");
    }

    /**
     * THIS METHOD WILL ALLOW US TO ISSUE A BOOK FROM THE LIBRARY
     */
    public void doCheckOut(String bookName) {
        System.out.println(bookName + ",is Issued To You Successfully.");
    }

    /**
     * this Method Will help in returning the Issued Book
     */
    public void doReturn(String bookName) {
        System.out.println(bookName + ",is Returned Succesfully.");
    }

    /**
     * this will Print all the elements Of the Arrays.
     * we are using foreach loop to print the Array.
     */
    public void listBooks() {
        for (Book bookObject : this.booksCurrentlyAvailable) {
            System.out.println(bookObject);
        }
    }
}
