public class MainMethod3 {
    public void addValue(int a, int b) {
        int sum = a + b;
        System.out.println("Res: " + sum);
    }

    public static void main(String[] args) {
        MainMethod3 obj = new MainMethod3();
        obj.addValue(10, 20);

    }
}