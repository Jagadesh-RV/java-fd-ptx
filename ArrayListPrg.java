import java.util.ArrayList;

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
        //to print the ArrayList
        System.out.println("List : " +list);
    }

}