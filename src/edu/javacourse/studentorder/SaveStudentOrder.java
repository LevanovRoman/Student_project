package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
//        buildStudentOrder();

//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder");

        return answer;
    }

    static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        Adult husband = new Adult("Васильев", "Андрей", "Петрович", null);
//        husband.setGivenName("Андрей");
//        husband.setSurName("Петров");
//        husband.setPassportNumber("123456");
//        so.setHusband(husband);
//
//        String ans = husband.getPersonString();
//        System.out.println(ans);
        return so;
    }
}
