import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library=new Library(30);
        book=new Book("Harry Potter and the Goblet of Fire","J.K. Rowling","Fantasy");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0,library.countBooks());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1,library.countBooks());
    }



}
