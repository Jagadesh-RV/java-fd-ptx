import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of rows for the multiplication table: ");
        int m = sc.nextInt();

        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= m; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        sc.close();
    }
}