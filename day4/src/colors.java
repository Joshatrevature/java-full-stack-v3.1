import java.util.ArrayList;
//prob 1
public class colors {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("amber");
        colors.add("blue");

        for (String color: colors) System.out.println(color);

        /*Collections.sort(colors);
        for (String color: colors) System.out.println(color);
        */

    }
}
