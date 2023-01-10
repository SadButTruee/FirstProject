package edu.java.studentorder;

import edu.java.studentorder.domain.Adult;
import edu.java.studentorder.domain.Person;
import edu.java.studentorder.domain.StudentOrder;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();

        //long answer = saveStudentOrder(studentOrder);
        //System.out.println(answer);
        char a = 49;
        System.out.println(isIsomorphic("foo", "bar"));

    }

    public static boolean isIsomorphic(String s, String t) {
        int [] alphabet_1 = new int[127];
        int [] alphabet_2 = new int[127];
        char[] str_1 = s.toCharArray();
        char[] str_2 = t.toCharArray();
        int i = 0;
        while (i < str_1.length) {
            int c_1 = str_1[i];
            int c_2 = 127 - c_1;
            alphabet_1[c_1] = alphabet_1[c_1] == 0 ? 1 : 0;
            alphabet_2[c_2] = alphabet_2[c_2] == 0 ? 1 : 0;
            if (alphabet_1[c_1] != alphabet_2[c_2])
                return false;
            i++;
        }
        return true;
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
