import java.util.Map;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        Map<String,Integer> h = new HashMap<>();

        h.put("anil",1);
        h.put("Kohli",2);
        h.put("raina",3);
        h.put("dhoni",4);

        System.out.println("elements in hashmap after adding are:"+h);

        h.remove("Kohli");

        System.out.println("elements after removing are:"+h);


    }
}
