import java.util.Scanner;

public class NameArray {
    public static void printArray(String[] arr) {
        System.out.println("The array elements are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        sc.nextLine(); // consume remaining newline
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name at position " + (i + 1) + " in the array :");
            String s = sc.nextLine();
            arr[i] = s;

        }
        printArray(arr);
        sc.close();

    }
}