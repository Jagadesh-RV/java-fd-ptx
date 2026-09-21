
class Student {

    String name;
    String department;
    int age;

    void study(String name) {
        System.out.println(name + " is Studying");
    }

    void exam(String name) {
        System.out.println(name + " is writing exam");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.department = "FDPTX";
        s1.study(s1.name);
        s1.exam(s1.name);
        

    }
}
