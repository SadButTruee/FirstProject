package edu.java.studentorder;

import edu.java.studentorder.domain.Adult;
import edu.java.studentorder.domain.Person;
import edu.java.studentorder.domain.StudentOrder;

import java.time.LocalDate;

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

    static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        Adult husband = new Adult("Vasiliev", "Andrey", "Petrovich", LocalDate.now());
        return so;
    }
}
