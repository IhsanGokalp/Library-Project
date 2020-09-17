package AppFunctionsImplementation.AdminProfile;

import AppFunctions.AdminProfile.ValidAdminAnswerCheck;

public class ValidAnswerOfAdmin implements ValidAdminAnswerCheck
{

    @Override
    public boolean isAnswerValid(String answer) {
        if (answer.equals("1") || answer.equals("2") || answer.equals("3"))
            return true;
        return false;
    }
}
