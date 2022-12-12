package edu.java.studentorder.validator;

import edu.java.studentorder.domain.AnswerStudent;
import edu.java.studentorder.domain.StudentOrder;

public class StudentValidator {

    public AnswerStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("Check student is running");
        return new AnswerStudent();
    }
}
