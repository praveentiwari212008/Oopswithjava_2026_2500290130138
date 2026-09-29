import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(10,96);
        hm.put(20,45);
        hm.put(30,8);
        hm.put(40,9);
        hm.put(50,6);
        for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
             System.out.println(i.getKey()+ ":"+ i.getValue());
        }
    }
}
