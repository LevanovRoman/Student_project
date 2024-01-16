package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerStudent;
import edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator {
    String name;
    String fio;

    public AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Student Check is running");
        return new AnswerStudent();
    }
}
