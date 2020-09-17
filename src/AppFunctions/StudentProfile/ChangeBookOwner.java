package AppFunctions.StudentProfile;

import Classes.Book;

import java.util.List;

public interface ChangeBookOwner {
    void changePlaceOfBook(List<Book> from, List<Book> to,Book book);
}
