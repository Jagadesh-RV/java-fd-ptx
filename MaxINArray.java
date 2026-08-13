public class MaxINArray {
    public static void main(String[] args) {
        int[] nums = { 12, 23, 22, 14, 35 };
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("The Maximum in the array is :" + max);
    }
}