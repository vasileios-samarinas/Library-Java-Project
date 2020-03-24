import java.util.ArrayList;

public class Library {

    private ArrayList<Book>books;
    private int capacity;

    public Library(int capacity){
        this.books=new ArrayList<Book>();
        this.capacity=capacity;
    }


    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(checkCapacity()){
            this.books.add(book);}
    }

    public boolean checkCapacity(){
        return this.capacity > countBooks();
    }

    public Book removeBook() {
        if (countBooks()==0){
            return null;
        }else{
            return this.books.remove(0);
        }
    }
}
