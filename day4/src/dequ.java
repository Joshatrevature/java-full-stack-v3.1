import java.util.ArrayDeque;
import java.util.Deque;

public class dequ {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Mark");
        deque.add("Paul");
        deque.add("Watson");
        deque.add("Pauline");
        deque.remove("Mark");

        for(String name: deque){
            System.out.println(name);
        }

    }
}

