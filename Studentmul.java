
import java.util.Scanner;

class Student {

    String name;
    String department;
    int age;

    public Student(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }
}

class Others {

    void study(String name) {
        System.out.println(name + " is Studying");
    }

    void exam(String name) {
        System.out.println(name + " is writing exam");
    }
}

public class Studentmul {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, department, age);
        }

        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;
        Others others = new Others();

        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchName)) {
                System.out.println("Name       : " + s.name);
                System.out.println("Department : " + s.department);
                System.out.println("Age        : " + s.age);
                others.study(s.name);
                others.exam(s.name);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nStudent \"" + searchName + "\" not found.");
        }

        sc.close();
    }
}
