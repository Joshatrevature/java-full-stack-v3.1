import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class imamap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();

        //1
        map.put(1, "Bobby");
        map.put(2, "Hill");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            // converting to map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
        //2
        System.out.println(map.size());
        //3
        Map<Integer,String > clonemap = (HashMap<Integer, String>) map.clone();

    }
}