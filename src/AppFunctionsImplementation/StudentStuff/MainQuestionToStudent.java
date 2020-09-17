package AppFunctionsImplementation.StudentStuff;

import AppFunctions.StudentProfile.StudentQuestion;

import java.util.Scanner;

public class MainQuestionToStudent implements StudentQuestion {

    @Override
    public String mainQuestionToStudent() {
        System.out.println("Are you going to borrow book, to return book or to go back?");
        System.out.println("(Press 1 for to borrow, press 2 for to return, press 3 to go back)");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        answer = answer.toLowerCase();
        if (answer.equals("1") || answer.equals("borrow")) {
            return "1";
        } else if (answer.equals("2") || answer.equals("return")) {
            return "2";
        }
        else if (answer.equals("3") || answer.equals("back"))
            return "3";

        return answer;
    }
}
