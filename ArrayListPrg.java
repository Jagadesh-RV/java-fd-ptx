import java.util.ArrayList;
import  java.util.*;
public class ArrayListPrg{
    public static void main(String[] args){
        //Declare ArrayLIst-p String
        ArrayList<String> list=new ArrayList<>();
        //add() -> to insert element ed of the ArrayList 
        list.add("is");
        list.add("a");
        //addFirst() -> to add the element front of ArrayList
        list.addFirst("He");
        //addLast() -> to ensure adding element at end of the List 
        list.addLast("Good");
        list.addLast("Boy");
        //set() -> to replace an element in a specific index position 
        list.set(3
            ,"Bad");
        //add (idx,element)  -> insert an element a specific index
        list.add(2,"also");
        //remove() -> USing object
        list.remove("boy");
        //remove() ->using index
        list.remove(4);
        //Sort the List 
        Collections.sort(list);
        //to print the ArrayList
        
        System.out.println("List : " +list);
    }

}