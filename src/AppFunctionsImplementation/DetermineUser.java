package AppFunctionsImplementation;

import AppFunctions.WhicUserLoggedIn;

public class DetermineUser implements WhicUserLoggedIn {

    @Override
    public String whichUser(String userSelection) {
        if (userSelection.equals("1") || userSelection.equals("student")) {
            return "student";
        }
        else if(userSelection.equals("2") || userSelection.equals("admin")
                || userSelection.equals("administrator"))
            return "admin";
        else
            return "quit";
    }
}
