package AppFunctionsImplementation.StudentStuff;

import AppFunctions.StudentProfile.ValidStudentAnswer;

public class CheckStudentBusinessValidation implements ValidStudentAnswer {
    @Override
    public boolean isStudentBusinessValid(String ans) {
        if (ans.equals("1") || ans.equals("2") || ans.equals("3"))
            return true;
        return false;
    }
}
