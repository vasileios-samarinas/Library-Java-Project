import java.util.ArrayList;

public class Borrower{

    private String firstName;
    private String lastName;
    private ArrayList<Book>bookList;

    public Borrower(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.bookList=new ArrayList<Book>();
    }


    public int countBorrowersBooks() {
        return this.bookList.size();
    }

    public void addBookToList(Book book) {
        this.bookList.add(book);
    }


}
