
class StudentParam {

    String name;
    String department;
    int age;

    StudentParam() {
        System.out.println("Default constructor called");
    }

    StudentParam(String name) {
        this.name = name;
    }

    StudentParam(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }
}

public class StudentParameterizedConstr {

    public static void main(String[] args) {
        StudentParam s = new StudentParam();
        StudentParam s2 = new StudentParam("Rahul");
        StudentParam s3 = new StudentParam("John", "FDPTX", 20);

        System.out.println("s.name: " + s.name);
        System.out.println("s2.name: " + s2.name);
        System.out.println("s3 details: " + s3.name + ", " + s3.department + ", " + s3.age);
    }
}
