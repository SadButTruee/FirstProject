package edu.java.studentorder.validator;

import edu.java.studentorder.domain.AnswerChildren;
import edu.java.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("Check children is running");
        return new AnswerChildren();
    }
}
