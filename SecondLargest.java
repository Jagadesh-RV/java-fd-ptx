import java.util.*;

public class SecondLargest {
    public static void secondMaxCheck(int[] arr) {
        boolean same=true;
        for(int i=1;i<arr.length;i++){
                if(arr[i-1]==arr[i]){
                    same=true;
                }
                else{
                    same=false;
                }
        }
        if(same){
                System.out.println("-1");
        }else{
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int secondmax=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > secondmax && arr[j] < max) {
                secondmax = arr[j];
            }
        }
        System.out.println("The second Largest num is :" + secondmax);
    }}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        secondMaxCheck(arr);
    }
}
