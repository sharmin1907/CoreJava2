package surpriseQuiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
    /*
     * User API to read the below textFile and print to console.
     * Use BufferedReader class.
     * Use try....catch block to handle Exception.
     *
     *
     * After reading from file using BufferedReader API, store each word into LinkedList & ArrayList
     * Use For Each loop/while loop/Iterator to retrieve data.
     */
    public String readMyTextFile(String filePath)  {
        String container;
        String text = null;
        //try {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((container = bufferedReader.readLine()) != null) {
                text = container;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            } catch (IOException e) {
            e.printStackTrace();
        }


        return text;

    }
}
