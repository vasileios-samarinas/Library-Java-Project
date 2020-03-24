import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("Mike","Porzingis");
        book=new Book("Harry Potter and the Goblet of Fire","J.K. Rowling","Fantasy");
    }

    @Test
    public void checkEmptyCollection(){
        assertEquals(0,borrower.countBorrowersBooks());
    }

    @Test
    public void addBookToCollection(){
        borrower.addBookToList(book);
        assertEquals(1,borrower.countBorrowersBooks());
    }


}
