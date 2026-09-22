public class SecretMsgDecoder{
    public static void main(String[] args) {
        String str = "Programming";
        int len = str.length();
        String newstr = "";
        boolean isVisited =true;
        for (int i=0;i<len;i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch=Character.toLowerCase(ch);
            }
            if(ch=isVisited){
                
            }
            }else{
                consonants=consonants+1;
            }
            
        }
        System.out.println("Vowels :"+ vowels);
        System.out.println("Consonants :"+ consonants);
    }
}