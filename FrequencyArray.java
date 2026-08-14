import java.util.*;

public class FrequencyArray {
    public static void freqCheck(int[] arr) {

    int n = arr.length;
    boolean[] visited = new boolean[n];
    for (int i = 0; i < n; i++) {
        if (visited[i]) {
            continue;
        }
        int count = 1;
        for (int j = i + 1; j < n; j++) {

            if (arr[i] == arr[j]) {
                count++;
                visited[j] = true;
            }
        }
        System.out.println(arr[i] + " -> " + count);
    }
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
        freqCheck(arr);
    }
}