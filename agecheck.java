public class agecheck {
    public static void main(String args[]){
        int age = 20 ;
        if (age<5){
            System.out.println("Child");
        }else if (age>=5 && age<=10){
            System.out.println("Teenager");
        }else if (age>=11 && age<=17){
            System.out.println("Young Adult");
        }else if (age>=18 && age<=60){
            System.out.println("Adult");
        }else{
            System.out.println("Senior Citizen");
    }
}