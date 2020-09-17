package AppFunctionsImplementation;

import AppFunctions.GetListOfBooks;
import Classes.Book;

import java.util.List;

public class ListBooks implements GetListOfBooks {
    @Override
    public void listBooksInLibrary(List<Book> library) {
        int currPos = 1;
        for (Book currBook : library) {
            System.out.println(currPos + ") " + currBook.getBookName() + ", by " + currBook.getAuthor());
        }
    }
}
