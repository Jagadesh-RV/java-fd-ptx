import java.util.Scanner;
public class WaterTempStatus{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water temperature: ");
        int temp = sc.nextInt();
        if(temp < 20 ){
            System.out.println("Water is cold");
        } else if(temp >= 20 && temp < 40){
            System.out.println("Water is Normal");
        } else {
            System.out.println("Water is Hot");
        }
        sc.close();
    }
}