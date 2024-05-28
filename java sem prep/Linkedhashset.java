import java.util.Set;
import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
        Set<String> l = new LinkedHashSet<>();
        l.add("anil");
        l.add("gayle");
        l.add("sara ali khan");

        System.out.println("Hash set elements after adding are:"+l);

        l.remove("sara ali khan");

        System.out.println("after removing "+l);
        
    }
}
