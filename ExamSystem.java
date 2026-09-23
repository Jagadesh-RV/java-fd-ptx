//polymorphism - overriding -> Runtime

class CEO {

    void Exam() {
        System.out.println("Exam Conduct ");
    }
}

class Engg extends CEO {

    @Override
    void Exam() {
        System.out.println("Exam Starts at 9 am ");
    }
}

class Arts extends CEO {

    @Override
    void Exam() {
        System.out.println("Exam starts at 10 am");
    }
}

public class ExamSystem {

    public static void main(String[] args) {
        CEO c1 = new CEO();
        CEO c2 = new Engg();
        CEO c3 = new Arts();
        c1.Exam();
        c2.Exam();
        c3.Exam();
    }
}
