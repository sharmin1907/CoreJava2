package quizes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList studentList = new ArrayList();
        HashSet subjectList = new HashSet();

        System.out.println("how many student do you want to calculate?");
        int count = scanner.nextInt();

       // HashMap<String,Integer> totalMarks =new HashMap<>();

        for (int i = 0; i < count; i++) {
            ArrayList marksList = new ArrayList();
            System.out.println("insert student name :");
            String student = scanner.next();
            for (int j = 0; j < 4; j++) {
                System.out.println("insert a subject");
                String subject = scanner.next();
                System.out.println("insert a marks");
                int marks = scanner.nextInt();
                //totalMarks.put(subject,marks);
                HashSet totalMarks = new HashSet();
                System.out.println("");
                Integer grade = scanner.hashCode();
            }

            System.out.println(marksList);


        }

    }
}
