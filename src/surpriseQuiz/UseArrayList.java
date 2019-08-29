package surpriseQuiz;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
    /*
     * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
     * Use For Each loop and while loop with Iterator to retrieve data.
     *
     */
    public static void main(String[] args) {
        //ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Orion");
        arrayList.add("Thea");
        arrayList.add("Sam");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
       arrayList.add(1,"Pal");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.remove(2));

        
        //for each loop-Array
        System.out.println("for each loop");
        for (String s : arrayList) {
            System.out.println(s);
        }

        //for while loop-Array
        System.out.println("for while loop");
        int num = 0;
        while (arrayList.size() > num) {
            System.out.println(arrayList.get(num));
            num++;
        }

        //for Iterator-Array
        System.out.println("for iterator loop");
        Iterator text = arrayList.iterator();
        while (text.hasNext()) {
            System.out.println(text.next());
        }


    }
}
