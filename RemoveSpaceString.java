public class RemoveSpaceString {
    public static void main(String [] args){
        String str= "Java Programming Language";
        int len =str.length();
        String newstr="";
        for (int i =0;i<len;i++){
            char ch=str.charAt(i)
            if(ch !=" "){
                newstr= newstr.concat(ch);
            }
        }
        System.out.println("Result :"+ newstr)
    }
}