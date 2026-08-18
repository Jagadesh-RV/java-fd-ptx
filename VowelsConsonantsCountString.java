public class VowelsConsonantsCountString {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        int len = str.length();
        String newstr = "";
        int vowels = 0;
        int consonants =0;
        for (int i=0;i<len;i++) {
            char ch = str.charAt(i);
            if (ch == 'a' ||ch  == 'e'|| ch =='i' ||ch  == 'o'|| ch == 'u'){
                vowels=vowels+1;
            }else{
                consonants=consonants+1;
            }
            
        }
        System.out.println("Vowels :"+ vowels);
        System.out.println("Consonants :"+ consonants);
    }
}