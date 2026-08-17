import java.util.*;
public class HashSetIntro {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        //add()
        set.add(5);
        set.add(15);
        set.add(8);
        set.add(29);
        set.add(105);
        System.out.println("Original HashSet :"+set);
        set.add(15);
        System.out.println("After adding again 15 :"+set);
        //to check element contains by HashSet or not
        System.out.println("is 29 Contains? "+ set.contains(29));
        //removing element
        set.remove(105);
        System.out.println("After removing 105 :"+ set);
        // to iterate over HAshset
        for (int num :set){
            System.out.println(num+" ");
        }
        set.clear();
    }
}