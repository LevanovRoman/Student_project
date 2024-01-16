package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    String age;
    String name;

    public AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }
}
