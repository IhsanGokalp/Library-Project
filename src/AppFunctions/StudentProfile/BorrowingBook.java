package AppFunctions.StudentProfile;

import Classes.Book;

import java.util.List;

public interface BorrowingBook {
    Book borrowBook(List<Book> library);
}
