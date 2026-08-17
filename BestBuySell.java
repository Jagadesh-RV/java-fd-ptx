import java.util.*;

public class BestBuySell {
    public static void buySell(int[] arr) {
        int n = arr.length;
        int bestbuy = arr[0];
        for (int i = 1; i < n - 1; i++) {
            if (bestbuy > arr[i]) {
                bestbuy = arr[i];
            }
        }
        int bestsell = arr[n - 1];
        for (int j = 0; j < n - 2; j++) {
            if (bestsell < arr[j]) {
                bestsell = arr[j];
            }
        }
        System.out.println("The profit with best buy and sell is :" + (bestsell-bestbuy));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element  " + (i + 1) + "  for the array :");
            int num = sc.nextInt();
            arr[i] = num;
        }
        buySell(arr);
    }
}