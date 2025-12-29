import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String authorName;

    // Parameterized constructor
    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Display method
    void display() {
        System.out.println("Book [bookId=" + bookId +
                ", bookName=" + bookName +
                ", authorName=" + authorName + "]");
    }
}

public class BookArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "Let us C", "Yashavant P Kanetkar"));
        books.add(new Book(102, "Head First Java", "Kathy Sierra"));

        System.out.println("--All Books--");

        // Advanced for loop
        for (Book b : books) {
            b.display();
        }
    }
}