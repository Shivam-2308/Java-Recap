package encapsulation;

import java.util.ArrayList;
import java.util.List;

class Library{
    private List<String>library = new ArrayList<>();  //Private list of books
    // Method to add a book to the library
    public void addBook(String book){
        library.add(book);
    }
    // Method to remove a book from the library
    public void removeBook(String book){
        library.remove(book);
    }
    // Getter for the list of books (returns a copy to avoid direct modification)
    public List<String> getBooks(){
        return new ArrayList<>(library); // Getter for the list of books (returns a copy to avoid direct modification)
    }
}
public class EncapWithCollections {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.addBook("Hindi");
        lb.addBook("Maths");
        lb.addBook("GK");
        System.out.println("Books in the library: "+lb.getBooks());

        // Modify the copy of the list, not the original list in Library class
        lb.removeBook("Hindi");
        System.out.println("Now books in the library: "+lb.getBooks());
    }
}
