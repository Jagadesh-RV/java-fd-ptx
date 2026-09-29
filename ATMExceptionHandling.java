class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
public class ATMExceptionHandling{
    public static void main(String[] args){
        int w=5000;
        int balance=20000;
        try{
            if(w>balance){
                throw new InsufficientBalanceException("Insufficient Balance");
            }else{
                System.out.println("withdrawn amount : " + w);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}