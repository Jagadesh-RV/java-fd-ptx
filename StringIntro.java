public class StringIntro {
    public static void main(String[] args) {
        String s = "Rahul";
        s = s.concat("o");
        System.out.println(s);
        int len=s.length();
        System.out.println("The length of the string is :"+len);
        char ch = s.charAt(3);
        System.out.println("The character positioned  at the position is :"+ch);
        String substr = s.substring(2,4);
        System.out.println("The substring is :"+ substr);
        System.out.println("Uppercase :"+ s.toUpperCase());
        System.out.println("Lowercase : "+ s.toLowerCase());
        
        boolean isSame = s.equals("Rahulo");
        System.out.println("Same compare "+ isSame );
        String name = "Harish ";
        boolean isSameCase = name.equalsIgnoreCase("harish");
        System.out.println("Without case sensitive : "+ isSameCase);

        }
}