package edu.java.studentorder.validator;

import edu.java.studentorder.domain.AnswerCityRegister;
import edu.java.studentorder.domain.StudentOrder;
import edu.java.studentorder.exception.CityRegisterException;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    String login;
    public String password;

    private CityRegisterChecker cityRegisterChecker;

    public CityRegisterValidator() {
        cityRegisterChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister  checkCityRegister(StudentOrder studentOrder) {
        try {
            var husbandAnswer = cityRegisterChecker.checkPerson(studentOrder.getHusband());
            var wifeAnswer = cityRegisterChecker.checkPerson(studentOrder.getWife());
            var childAnswer = cityRegisterChecker.checkPerson(studentOrder.getChild());
        } catch (CityRegisterException e) {
            e.printStackTrace();
        }

        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        return answerCityRegister;
    }
}
