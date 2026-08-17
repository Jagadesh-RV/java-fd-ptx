import java.util.*;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // to store key-value pairs in HashMap
        map.put("name", "Lohith");
        map.put("house no", "23c");
        map.put("area", "Saravanampatti");
        map.put("district", "Coimbatore");
        System.out.println("Original MAp:" + map);
        // get() -> Using key get the value
        System.out.println("Area :" + map.get("area"));
        //containsKey() -> to check key is exist on map
        System.out.println("district contains?" + map.containsKey("district"));
        //containsvalue()-> to check value is exist on map
        System.out.println("Lohith contains?"+map.containsValue("Lohith"));
    }
}