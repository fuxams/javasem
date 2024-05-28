import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Reverselist {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("Chicken");
        list.add("Doctor");

        System.out.println("original list "+list);

        Collections.reverse(list);
        System.out.println("reversed list "+list);


    }
}
