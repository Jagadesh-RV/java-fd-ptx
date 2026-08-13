import java.util.*;

public class FindMinMax {
    public static void findMax(int[] nums) {
        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("The Maximum in the array is :" + max);
    }

    public static void findMin(int[] nums) {
        int min=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("The Minimum in the array is :" + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            nums[i] = x;
        }
        findMax(nums);
        findMin(nums);
    }
}