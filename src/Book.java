import java.io.File;

import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by admin on 03.03.2017.
 */
public class Book {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> map = new HashMap<>();

        try (Scanner s = new Scanner(
                new File("C:\\Users\\Public\\Documents\\1.txt"), "Cp1251")) {
            while (s.hasNext()) {
                String word = s.next();

                if (map.containsKey(word)){
                    int count = map.get(word);
                    map.put(word, count+1);
                } else {
                    map.put(word, 1);

                }
            }

        }
        Set<Map.Entry<String,Integer>>
        set = map.entrySet();
        ArrayList<Map.Entry<String,Integer>>
                list=new ArrayList<>(set);
        list.sort((e1,e2)-> -e1.getValue().compareTo(e2.getValue()));

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry);
        }

        

    }
}