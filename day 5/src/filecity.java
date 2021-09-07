import java.io.File;
import java.io.IOException;

public class filecity {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db");

        String[] list = file.list();
        for (String s: list){
            count++;
            System.out.println(s);
        }

        //file.delete();

        //File file1 = new File("db","second.txt" );
        //System.out.println(file.exists());

        //file.mkdir();

        /*try {
            file.createNewFile();
        }   catch (IOException e) {
            e.printStackTrace();
        }  */

        //System.out.println(file.exists());

    }
}
