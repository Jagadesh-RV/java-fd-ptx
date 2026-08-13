import java.util.Scanner;
public class PrimeInRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("The prime numbers in the range are: ");
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
             
            }
            if (count > 0) {
                   continue;
            }else{
                 System.out.print(i + " ");
            }
    }
}
}