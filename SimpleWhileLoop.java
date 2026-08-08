public class SimpleWhileLoop {
    public static void main(String[] args) {
        int n = 225;
        int i = 5;
        int count = 0;
        while (n >= i) {
            count ++;
            n=n/i;
        }
        System.out.println("The number of trailing zeros in 225! is: " + count);
    }
}