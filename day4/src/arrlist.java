import java.util.*;


//prob 2-9
public class arrlist {
    public static void main(String[] args) {
        ArrayList<String> mList = new ArrayList<>();

        mList.add("dave");
        mList.add("Bobby");
        mList.add("Hank");
        //System.out.println(mList);

        //2
        for (String s : mList) {
            System.out.println(s);
        }
        //3
        mList.add(0,"Luanne");

        for (String name: mList){
            System.out.println(name + "\n");
        }
        //4
        String person = mList.get(0);
        System.out.println(person + "\n");
        //5 and 6
        mList.set(1,"Dale");
        mList.remove(2);
        System.out.println(mList + "\n");
        //7
        if (mList.contains("Dale"))
            System.out.println("Dale is here \n");
        //8
        Collections.sort(mList);
        System.out.println(mList + "\n");

        //9
        //ArrayList<String> mlist2 = new ArrayList<>(mList);
        ArrayList<String>  mlist2 = new ArrayList<>();
        mlist2.addAll(mList);
        System.out.println(mlist2);
        //10
        Collections.shuffle(mList);
        System.out.println(mList + "\n");

        //11
        Collections.reverse(mList);
        System.out.println(mList + "\n");

        //12
        for (int i=0;i<2;i++){
            System.out.println(mList.get(i) + "\n");
        }

        //13
        Collections.swap(mList,0,2);
        System.out.println(mList);

       /* System.out.println(mList.get(1));

        mList.set(1, "Luane");
        for (String name: mList) System.out.println(name);
        */

    }
}
