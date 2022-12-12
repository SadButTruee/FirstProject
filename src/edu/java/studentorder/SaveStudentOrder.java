package edu.java.studentorder;

import edu.java.studentorder.domain.Adult;
import edu.java.studentorder.domain.Person;
import edu.java.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();

        long answer = saveStudentOrder(studentOrder);
        System.out.println(answer);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " );
        return answer;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();

        Adult husband = new Adult();

//        husband.setFirstName("Andrey");
//        husband.setLastName("Petrov");
//        husband.setPassportNumber("123456");
//        so.setHusband(husband);
//
//        String str = husband.getPersonString();
//        System.out.println(str);

        return so;
    }
}
