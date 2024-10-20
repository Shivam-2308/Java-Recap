package association;

import java.util.ArrayList;
import java.util.List;

//Scenario: A Library class that contains many Book objects. The Library class knows about the Book, but the
// Book class does not know about the Library.
class Book{
    String title;
    Book(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
}
class Library{
    private String name;
    private List<Book> books;
    Library(String name){
        this.name=name;
        this.books=new ArrayList<>();  //This initializes the books list as an empty ArrayList<Book>.
    }
    public void addBooks(Book book){
        books.add(book);
    }
    public void showBooks(){
        for (Book book : books){
            System.out.println("Book title: "+book.getTitle());
        }
    }
}
public class Unidirectional {
    public static void main(String[] args) {
        Library lb = new Library("Allen");
        Book b1 = new Book("RD. Shrama");
        Book b2 = new Book("RS. Aggarwal");
        lb.addBooks(b1);
        lb.addBooks(b2);
        lb.showBooks();
    }
}
