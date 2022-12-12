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
        while (true) {
            StudentOrder studentOrder = readStudentOrder();
            if (studentOrder == null) {
                break;
            }

            AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
            if(!answerCityRegister.success){
                continue;
            }

            AnswerWedding answerWedding = checkWedding(studentOrder);
            AnswerChildren answerChildren = checkChildren(studentOrder);
            AnswerStudent answerStudent = checkStudent(studentOrder);

            sendMail(studentOrder);
        }
        System.out.println("Finish 2");
    }
    public StudentOrder readStudentOrder() {
        return new StudentOrder();
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
