package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerWedding;
import edu.javacourse.studentorder.domain.StudentOrder;

public class WeddingValidator {
    String param1;
    String param2;

    public AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
}
