public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        int len = str.length();
        String newstr = "";
        for (int i = len - 1; i >= 0; i--) {
            char ch = str.charAt(i);
                newstr = newstr + ch;
            
        }
        System.out.println("Result :" + newstr);
    }
}