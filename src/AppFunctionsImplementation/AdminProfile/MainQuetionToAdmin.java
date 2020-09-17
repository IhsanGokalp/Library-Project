package AppFunctionsImplementation.AdminProfile;

import AppFunctions.AdminProfile.AdminQuestion;

import java.util.Scanner;

public class MainQuetionToAdmin implements AdminQuestion {

    @Override
    public String mainAdminQuestion() {
        System.out.println("Do you want to list books, or who borrowed book? ");
        System.out.println("(Press 1 for to list books, press 2 for to list who borrowed)");
        Scanner input = new Scanner(System.in);

        String answer = input.next();
        answer = answer.toLowerCase();

        if (answer.equals("1") || answer.equals("book") ||answer.equals("books")) {
            return "1";
        }
        else if (answer.equals("2") || answer.equals("borrowed") ||answer.equals("who") || answer.equals("borrow")) {
            return "2";
        }
        return "3";
    }
}
