class Account{
    private long account_no;
    private double balance;
    private String name;
    public Account(long account_no, double balance , String name ){
        this.account_no=account_no;
        this.balance=balance;
        this.name=name;
    }
    public void Access() {
        System.out.println("Account No:" + account_no);
        System.out.println("Name :" + name);
        System.out.println("Balance :" + balance);
    }
}

public class AccountAccess{
    public static void main(String [] args){
        Account a=new Account(1010101,1000,"Jagadesh");
        a.Access();
    }
}