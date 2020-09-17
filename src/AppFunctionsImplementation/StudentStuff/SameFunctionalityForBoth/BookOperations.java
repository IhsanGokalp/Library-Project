package AppFunctionsImplementation.StudentStuff.SameFunctionalityForBoth;

import AppFunctions.StudentProfile.SameFunctionalityOfReturnAndBorrow.SelectionOfBook;
import Classes.Book;

import java.util.List;
import java.util.Scanner;

public class BookOperations implements SelectionOfBook {
    @Override
    public int getWhichBookToOperate(List<Book> bookPlace) {
        System.out.println("Select the book number (Only number is going to be accepted): ");
        Scanner input = new Scanner(System.in);
        int bookRow = input.nextInt();
        System.out.println();

        while (bookRow>bookPlace.size()) {
            System.out.println("Wrong book number, please select number of the book from list");
            bookRow = input.nextInt();
            System.out.println();
        }
        return bookRow;
    }
}
