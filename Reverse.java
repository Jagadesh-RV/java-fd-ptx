import java.util.*;
public class Reverse{
    public int reverseNumber(int n){
        int rev=0;
        while(n>0){
            int rem =n%10;
            rev =rev*10+rem;
            n=n/10;

        }
        return rev;
    }
    public static void main(String[] args){
        Reverse obj = new Reverse();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to reverse :");
        int num=sc.nextInt();
        System.out.println("Rev of " + num +" is  : "+obj.reverseNumber(num));
         sc.close();
    }
   
}