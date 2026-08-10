import java.util.Scanner;

public class SecurityPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m = 0;
        while (n > 0) {
            int s = n % 10;
            m = m * 10 + s;
            n = n / 10;
        }
        
        System.out.println("The reverse of the number is: " + m);
        sc.close();
    }

}