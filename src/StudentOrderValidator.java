public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll(){
        StudentOrder so = readStudentOrder();
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        sendMail(so);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "Login1";
        crv1.password = "Password1";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        WeddingValidator wv = new WeddingValidator();
        wv.param1 = "smth1";
        wv.param2 = "smth2";
        AnswerWedding aw = wv.checkWedding(so);
        return aw;
    }

    static AnswerChildren checkChildren(StudentOrder so){
        ChildrenValidator cv = new ChildrenValidator();
        cv.age = "qw";
        cv.name = "wer";
        AnswerChildren ac = cv.checkChildren(so);
        return ac;
    }

    static AnswerStudent checkStudent(StudentOrder so){
        StudentValidator sw = new StudentValidator();
        sw.name = "efs";
        sw.fio = "sdvsdfv";
        AnswerStudent as = sw.checkStudent(so);
        return as;
    }

    static void sendMail(StudentOrder so){

    }

}
