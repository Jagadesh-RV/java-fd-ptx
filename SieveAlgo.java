public class SieveAlgo{
    public static void findPrimes(int num){
        boolean is=true;
        int size[]=new int[num];
        for (int i = 0; i < size.length; i++) {
            size[i]=i;      
        }
        for (int i = 2; i < size.length; i++) {
            if(is){
                for (int j = 2*i; j < size.length; j+=i) {
                    size[j]=0;
                }
            }
            
        }
        for (int i = 0; i < size.length; i++) {
            if(size[i]!=0){
                System.out.println(size[i]);
            }
        }
    }
    public static void main(){
        findPrimes(100);
    }
}