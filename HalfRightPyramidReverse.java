class HalfRightPyramidReverse{
    public static void main(String[] args) {
        int n = 4;
        for (int row =n;row>=1;row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}