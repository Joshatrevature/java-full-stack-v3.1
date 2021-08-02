import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class OakBeard {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hank");
        treeSet.add("Bobby");

        for (String name: treeSet)
            System.out.println(name);

        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Sally");
        treeSet1.add("Dale");

        treeSet.addAll(treeSet1);
        System.out.println(treeSet);

        NavigableSet<String>
                treereverse = treeSet.descendingSet();
        Iterator<String> iterator = treereverse.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        //Sets aren't indexed, so you can't get the first or last.
    }
}
