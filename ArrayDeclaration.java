public class ArrayDeclaration {
    public static void main(String[] args) {
        int size = 3;
        int[] num = new int[size];

        num[0] = 10;
        num[1] = 20;
        num[2] = 30;

        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
    }
}