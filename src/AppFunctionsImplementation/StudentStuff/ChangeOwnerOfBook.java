package AppFunctionsImplementation.StudentStuff;

import AppFunctions.StudentProfile.ChangeBookOwner;
import Classes.Book;

import java.util.List;

public class ChangeOwnerOfBook implements ChangeBookOwner {
    @Override
    public void changePlaceOfBook(List<Book> from, List<Book> to, Book book) {
        from.remove(book);
        to.add(book);
    }
}
