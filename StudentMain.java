// non-parameterized constructor

class Students {

    String name;
    String department;
    int age;

    Students() {
        System.out.println("The object is created ");
    }

}

class StudentMain {

    public static void main(String[] args) {
        Students s = new Students();

    }
}
