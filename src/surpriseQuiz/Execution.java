package surpriseQuiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Execution {
    public static void main(String[] args) {
        String read = null;
        DataReader dataReader = new DataReader();
        read = dataReader.readMyTextFile("src\\surpriseQuiz\\TextFile.txt");
        System.out.println("Read my text: " + read);

        System.out.println("LinkedList store");
        //LinkedList linkedList = new LinkedList();
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Read");
        linkedList.add("the");
        linkedList.add("file");
        linkedList.add("for");
        linkedList.add("surprise");
        linkedList.add("quiz");
        /*for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }*/

        //for each loop
        System.out.println("for each loop");
        for (String s : linkedList) {
            System.out.println(s);
        }

        //for while loop
        System.out.println("for while loop");
        int i = 0;
        while (linkedList.size() > i) {
            System.out.println(linkedList.get(i));
            i++;
        }

        //for Iterator
        System.out.println("for iterator loop");
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //ArrayList
        System.out.println("ArrayList store");

        //ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Read");
        arrayList.add("the");
        arrayList.add("file");
        arrayList.add("for");
        arrayList.add("surprise");
        arrayList.add("quiz");

        //for each loop
        System.out.println("for each loop");
        for (String s : arrayList) {
            System.out.println(s);
        }

        //for while loop
        System.out.println("for while loop");
        int num = 0;
        while (linkedList.size() > num) {
            System.out.println(linkedList.get(num));
            num++;
        }

        //for Iterator
        System.out.println("for iterator loop");
        Iterator text = linkedList.iterator();
        while (text.hasNext()) {
            System.out.println(text.next());
        }

    }
}

