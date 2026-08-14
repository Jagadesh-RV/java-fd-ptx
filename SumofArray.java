import java.util.*;

public class SumofArray {
    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of elements in the array is :public static void main(String[] args) {\r\n" + //
                        "        Scanner sc = new Scanner(System.in);\r\n" + //
                        "        System.out.println(\"Enter the size of the array:\");\r\n" + //
                        "        int size = sc.nextInt();\r\n" + //
                        "        int[] arr = new int[size];\r\n" + //
                        "        for (int i = 0; i < size; i++) {\r\n" + //
                        "            System.out.println(\"Enter the element  \"+ (i+1)+ \"  for the array :\");\r\n" + //
                        "            int num = sc.nextInt();\r\n" + //
                        "            arr[i] = num;\r\n" + //
                        "        }\r\n" + //
                        "        sumArray(arr);" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element  "+ (i+1)+ "  for the array :");
            int num = sc.nextInt();
            arr[i] = num;
        }
        sumArray(arr);
    }
}