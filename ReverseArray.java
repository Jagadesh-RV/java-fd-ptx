import java.util.*;
public class ReverseArray {
    public static void revArray(int [] arr){
        int l=arr.length;
        int [] revarr=new int[l];
        for(int i=0;i<l;i++){
            revarr[l-1-i]=arr[i];
        }
        System.out.print(" The reversed array  is :");
        for (int j = 0; j < l; j++) {
            System.out.print(revarr[j]+" ");
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