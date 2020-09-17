package AppFunctionsImplementation.StudentStuff;

import AppFunctions.StudentProfile.ListBorrowedBooks;
import AppFunctions.StudentProfile.ReturningBook;
import AppFunctions.StudentProfile.SameFunctionalityOfReturnAndBorrow.SelectionOfBook;
import AppFunctionsImplementation.StudentStuff.SameFunctionalityForBoth.BookOperations;
import Classes.Book;
import Classes.Student;

public class ReturnBook implements ReturningBook {
    @Override
    public Book returnBook(Student user) {
        ListBorrowedBooks listingBorrowedOnes = new GetListOfBorrowedBooks();
        listingBorrowedOnes.getListOfBorrowedBooks(user);
        SelectionOfBook bookSelect = new BookOperations();
        int bookRow = bookSelect.getWhichBookToOperate(user.getBorrowedBooks());

        return user.getBorrowedBooks().get(bookRow-1);
    }
}
