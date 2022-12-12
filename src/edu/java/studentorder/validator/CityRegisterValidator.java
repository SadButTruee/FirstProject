package edu.java.studentorder.validator;

import edu.java.studentorder.domain.AnswerCityRegister;
import edu.java.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister is running: " + hostName + ", " + login + ", " + password);
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        answerCityRegister.success = false;
        return answerCityRegister;
    }
}
