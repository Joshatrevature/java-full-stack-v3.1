import java.util.HashSet;
import java.util.Iterator;

public class Hashtime {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dale");
        set.add("Bobby");
        set.add("Peggy");

        Iterator iterator = set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
