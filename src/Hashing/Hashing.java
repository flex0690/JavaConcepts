package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Hashing {

    static void hashSetBasic() {
        HashSet<String> hash = new HashSet<>();

        hash.add("ONE");
        hash.add("TWO");
        hash.add("THREE");

        System.out.println(hash);

        System.out.println(hash.contains("TWO"));

        Iterator<String> iterator = hash.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : hash) {
            System.out.println(s);
        }
    }

    static void hashMapBasic() {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("hello",1);
        hash.put("world",1);
        hash.put("something",3);

        System.out.println(hash);

        for(Map.Entry<String, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void main(String[] args) {
//        hashSetBasic();

        hashMapBasic();
    }
}
