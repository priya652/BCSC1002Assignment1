/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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

}
