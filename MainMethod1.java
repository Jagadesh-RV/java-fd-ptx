public class MainMethod1 {
    public int addValue(){
        int a=5 ; int b=8;
        int sum = a+b ;
        return sum;
    }

    public static void main(String[] args) {
        MainMethod1 obj = new MainMethod1();
        int res = obj.addValue();
        System.out.println("Res: " + res);
    }
}