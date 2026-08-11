public class MainMethod2 {
    public int addValue(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        MainMethod2 obj = new MainMethod2();
        int res = obj.addValue(10, 20);
        System.out.println("Res: " + res);
    }
}