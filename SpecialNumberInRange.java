import java.util.Scanner;
public class SpecialNumberInRange{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a start number :");
        int n = sc.nextInt();
        System.out.println("Enter a end number :");
        int m = sc.nextInt();
        System.out.println("The special numbers in the range are :");
        for(int i=n; i<=m; i++){
            int d1=i%10;
            int d2=i/10;
            if((d1+d2)+(d1*d2)==i){
                System.out.println(i);
            }
        }
        
    }
}