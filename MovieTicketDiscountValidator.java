import java.util.Scanner;
public class  MovieTicketDiscountValidator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age of the person: ");
        int age = sc.nextInt();
        System.out.println("Enter the original price of the ticket: ");
        float price = sc.nextFloat();
        if(age<12){
            System.out.println("Discounted Applied is : 50% ");
            System.out.println("Final Ticket price is: "+(price*0.5));
        } else if(age>=12 && age<=60){
            System.out.println("No Discount");
            System.out.println("Final Ticket price is: "+price);
        } else {
            System.out.println("Discounted Applied is : 30%");
            System.out.println("Final Ticket price is: "+(price*0.7));
        }
        sc.close();
    }
}