import java.util.LinkedList;
import java.util.Iterator;

public class LinkLisst {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Bobby");
        names.addLast("Hank");

        Iterator iterator = names.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        names.add("Luanne");

        for (int i = 1; i < names.size(); i++ ) {
            System.out.println(names.get(i));
        }

        Iterator reverseiterator = names.descendingIterator();
        while (reverseiterator.hasNext())
            System.out.println(reverseiterator.next());

        names.add(1, "Dale");
        System.out.println(names);
    }


}
