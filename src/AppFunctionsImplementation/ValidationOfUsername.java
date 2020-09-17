package AppFunctionsImplementation;

import AppFunctions.UserValidation;

public class ValidationOfUsername implements UserValidation {
    @Override
    public boolean isUserValid(String user) {
        user = user.toLowerCase();
        if (user.equals("administrator") || user.equals("student")
                || user.equals("1") || user.equals("2") || user.equals("3") || user.equals("quit")) {
            return true;
        }

        return false;
    }
}
