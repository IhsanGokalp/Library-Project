import AppFunctions.AddBooks;
import AppFunctions.AdminProfile.AdminQuestion;
import AppFunctions.AdminProfile.ValidAdminAnswerCheck;
import AppFunctions.GetListOfBooks;
import AppFunctions.StudentProfile.*;
import AppFunctions.UserValidation;
import AppFunctions.WhicUserLoggedIn;
import AppFunctionsImplementation.AdminProfile.MainQuetionToAdmin;
import AppFunctionsImplementation.AdminProfile.ValidAnswerOfAdmin;
import AppFunctionsImplementation.DetermineUser;
import AppFunctionsImplementation.GenerateBooks;
import AppFunctionsImplementation.ListBooks;
import AppFunctionsImplementation.StudentStuff.*;
import AppFunctionsImplementation.StudentStuff.BorrowBook;
import AppFunctionsImplementation.ValidationOfUsername;
import Classes.Book;
import Classes.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<Book>();
        AddBooks addBooksToLibrary = new GenerateBooks();
        addBooksToLibrary.addingBookToLibrary(library);

        Scanner input = new Scanner(System.in);
        boolean wantToQuit = false;
        while (!wantToQuit) {
            System.out.println("Who are you?");
            System.out.println("(1 for student, 2 for administrator, 3 to quit)");

            UserValidation validation = new ValidationOfUsername();
            String userSelection = input.next();
            boolean validUser = validation.isUserValid(userSelection);

            while (!validUser) {
                System.out.println("User should be valid.");
                userSelection = input.next();
                validUser = validation.isUserValid(userSelection);
            }

            WhicUserLoggedIn user = new DetermineUser();
            String userType = user.whichUser(userSelection);

            if (userType.equals("student")) {
                NewStudentMethod studentAccount = new NewStudentAccount();

                System.out.print("What is your name? ");
                String firstName = input.next();
                System.out.printf("%n%nWhat is your surname? ");
                String surname = input.next();
                System.out.printf("%n%nWhat is your phone number? ");
                String phoneNumber = input.next();
                System.out.println();
                boolean checkToContinue = true;
                while (checkToContinue) {
                    Student userStudent = studentAccount.newStudent(firstName, surname, phoneNumber);
                    StudentQuestion studentQuestion = new MainQuestionToStudent();
                    String studentDecision = studentQuestion.mainQuestionToStudent();

                    ValidStudentAnswer studentBusiness = new CheckStudentBusinessValidation();
                    boolean validStudentBusiness = studentBusiness.isStudentBusinessValid(studentDecision);
                    while (!validStudentBusiness) {
                        System.out.println("Answer should be 'borrow', 'return' or 'back'");
                        studentDecision = studentQuestion.mainQuestionToStudent();
                        validStudentBusiness = studentBusiness.isStudentBusinessValid(studentDecision);
                    }

                    ChangeBookOwner bookPlaceChanger = new ChangeOwnerOfBook();
                    List<Book> studentBooks = userStudent.getBorrowedBooks();

                    if (studentDecision.equals("1")) {
                        BorrowingBook studentBorrows = new BorrowBook();
                        Book borrowedBook = studentBorrows.borrowBook(library);

                        bookPlaceChanger.changePlaceOfBook(library, studentBooks, borrowedBook);
                        userStudent.setBorrowedBooks(studentBooks);
                        checkToContinue = false;
                    } else if (studentDecision.equals("2")) {
                        ReturningBook bookReturn = new ReturnBook();
                        Book bookToReturn = bookReturn.returnBook(userStudent);
                        bookPlaceChanger.changePlaceOfBook(studentBooks, library, bookToReturn);
                        userStudent.setBorrowedBooks(studentBooks);
                        checkToContinue = false;
                    } else
                        checkToContinue = true;
                }
            } else if (userType.equals("admin")) {
                boolean wantToGoBack = false;
                while(!wantToGoBack) {
                    AdminQuestion mainQuestionToAdmin = new MainQuetionToAdmin();
                    String adminBusiness = mainQuestionToAdmin.mainAdminQuestion();
                    ValidAdminAnswerCheck adminMainAnswerValidity = new ValidAnswerOfAdmin();
                    boolean validAdminBusiness = adminMainAnswerValidity.isAnswerValid(adminBusiness);
                    while (!validAdminBusiness) {
                        System.out.println("Answer should be 'list', 'who borrowed' or 'back'");
                        adminBusiness = mainQuestionToAdmin.mainAdminQuestion();
                        validAdminBusiness = adminMainAnswerValidity.isAnswerValid(adminBusiness);
                    }

                    if (adminBusiness.equals("1")) {
                        GetListOfBooks listBooksInLibrary = new ListBooks();
                        listBooksInLibrary.listBooksInLibrary(library);
                    }
                }
            }

            else
                wantToQuit = true;
        }
    }
}