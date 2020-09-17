package AppFunctionsImplementation;

import AppFunctions.AddBooks;
import Classes.Book;

import java.util.List;

public class GenerateBooks implements AddBooks {
    @Override
    public List<Book> addingBookToLibrary(List<Book> library) {
        Book book1 = new Book("JK Rowling","HP The Sorcerer's Stone");
        library.add(book1);
        Book book2 = new Book("JK Rowling","HP The Chamber of Secrets");
        library.add(book2);
        Book book3 = new Book("JK Rowling","HP The Prisoner Of Azkhaban");
        library.add(book3);
        Book book4 = new Book("JK Rowling","HP The Goblet of Fire");
        library.add(book4);
        Book book5 = new Book("JK Rowling","HP The Order Of The Phonix");
        library.add(book5);
        Book book6 = new Book("JK Rowling","HP The Half Blood Prince");
        library.add(book6);
        Book book7 = new Book("JK Rowling","HP The Deathly Hollows");
        library.add(book7);
        Book book = new Book("JK Rowling","HP The Cursed Child");
        library.add(book);
        Book book8 = new Book("J. R. R. Tolkien","The Hobbit");
        library.add(book8);
        Book book9 = new Book("J. R. R. Tolkien","LOR The Fellowship of the Ring");
        library.add(book9);
        Book book10 = new Book("J. R. R. Tolkien","The Return of the King ");
        library.add(book10);
        return library;
    }
}
