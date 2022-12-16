package edu.java.studentorder;

import edu.java.studentorder.domain.*;
import edu.java.studentorder.mail.MailSender;
import edu.java.studentorder.validator.ChildrenValidator;
import edu.java.studentorder.validator.CityRegisterValidator;
import edu.java.studentorder.validator.StudentValidator;
import edu.java.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;

    private WeddingValidator weddingValidator;

    private StudentValidator studentValidator;

    private ChildrenValidator childrenValidator;

    private MailSender mailSender;

    public StudentOrderValidator() {
        childrenValidator = new ChildrenValidator();
        weddingValidator = new WeddingValidator();
        cityRegisterValidator = new CityRegisterValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();
    }

    public void checkAll() {
        StudentOrder[] studentOrders = readStudentOrders();
        for (StudentOrder so : studentOrders) {
            checkOneOrder(so);
        }
    }

    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister answerCityRegister = checkCityRegister(so);

        AnswerWedding answerWedding = checkWedding(so);
        AnswerChildren answerChildren = checkChildren(so);
        AnswerStudent answerStudent = checkStudent(so);

        sendMail(so);
    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] arr = new StudentOrder[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = SaveStudentOrder.buildStudentOrder(i);
        }
        return arr;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        return  cityRegisterValidator.checkCityRegister(studentOrder);
    }

    public AnswerWedding checkWedding(StudentOrder studentOrder) {
        return weddingValidator.checkWedding(studentOrder);
    }

    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        return childrenValidator.checkChildren(studentOrder);
    }

    public AnswerStudent checkStudent(StudentOrder studentOrder) {
        return studentValidator.checkStudent(studentOrder);
    }

    public void sendMail(StudentOrder studentOrder) {
        mailSender.sendMail(studentOrder);
    }
}
