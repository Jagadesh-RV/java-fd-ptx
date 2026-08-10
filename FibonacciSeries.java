import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a=0, b=1, c;
        System.out.print("The fibonacci series is: " + a +" " + b + " ");
        for(int i=2 ; i<n ; i++ ){
                c = a + b ;
                a=b ;
                b=c ;
                System.out.print(c + " ");
        }
    }
}

