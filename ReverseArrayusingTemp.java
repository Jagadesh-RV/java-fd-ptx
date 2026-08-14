import java.util.*;

public class ReverseArrayusingTemp {
    public static void revArray(int [] arr){
        int l=arr.length;
        int r=0;
        int s=l-1;
        while(r<s){
            int temp=arr[r];
            arr[r]=arr[s];
            arr[s]=temp;
            r++;s--;

        }
        System.out.print(" The reversed array  is :");
        for (int j = 0; j < l; j++) {
            System.out.print(arr[j]+" ");
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
        revArray(arr);
    }
}