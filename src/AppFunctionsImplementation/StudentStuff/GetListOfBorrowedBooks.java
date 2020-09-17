package AppFunctionsImplementation.StudentStuff;

import AppFunctions.GetListOfBooks;
import AppFunctions.StudentProfile.ListBorrowedBooks;
import AppFunctionsImplementation.ListBooks;
import Classes.Student;


public class GetListOfBorrowedBooks implements ListBorrowedBooks {
    @Override
    public void getListOfBorrowedBooks(Student user) {
        GetListOfBooks list = new ListBooks();
        list.listBooksInLibrary(user.getBorrowedBooks());
    }
}
