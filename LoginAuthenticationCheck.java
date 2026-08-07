import java.util.Scanner;
public class  LoginAuthenticationCheck{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        if(username.equals("admin") && password.equals("admin123")){
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
        sc.close();
    }
}