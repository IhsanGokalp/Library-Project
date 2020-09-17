package AppFunctionsImplementation.StudentStuff;

import AppFunctions.StudentProfile.NewStudentMethod;
import Classes.Student;

public class NewStudentAccount implements NewStudentMethod {
    @Override
    public Student newStudent(String firstName, String lastName, String phoneNumber) {
        return new Student(firstName,lastName,phoneNumber);
    }
}
