import java.util.Scanner;

public class FinancialStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Profit");
        } else if (number == 0) {
            System.out.println("No Profit No Loss");
        } else {
            System.out.println("Loss");
        }
        sc.close();
    }

}