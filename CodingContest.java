import java.util.Scanner;

public class CodingContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        int n = sc.nextInt();
        int count = 0;
            for (int i = 2; i <= 5; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
        
        if (count == 1 ) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}