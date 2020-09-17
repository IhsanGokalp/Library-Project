package AppFunctionsImplementation.StudentStuff;

import AppFunctions.GetListOfBooks;
import AppFunctions.StudentProfile.BorrowingBook;
import AppFunctions.StudentProfile.SameFunctionalityOfReturnAndBorrow.SelectionOfBook;
import AppFunctionsImplementation.ListBooks;
import AppFunctionsImplementation.StudentStuff.SameFunctionalityForBoth.BookOperations;
import Classes.Book;

import java.util.List;

public class BorrowBook implements BorrowingBook {
    @Override
    public Book borrowBook(List<Book> library) {
        GetListOfBooks bookList = new ListBooks();
        bookList.listBooksInLibrary(library);
        SelectionOfBook bookSelect = new BookOperations();
        int bookRow = bookSelect.getWhichBookToOperate(library);
        return library.get(bookRow-1);
    }
}
