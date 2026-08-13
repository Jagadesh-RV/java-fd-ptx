public class MinINArray {
    public static void main(String[] args) {
        int[] nums = { 124, 23, 22, 14, 35 };
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("The Minimum in the array is :" + min);
    }
}