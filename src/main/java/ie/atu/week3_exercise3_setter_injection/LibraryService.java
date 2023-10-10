package ie.atu.week3_exercise3_setter_injection;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LibraryService {
    ArrayList<Book> booksInLibrary = new ArrayList<Book>();
    public void addBook(Book book) {
        booksInLibrary.add(book);
    }

    public ArrayList<Book> getBooks() {
        return booksInLibrary;
    }
}
