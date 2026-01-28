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

    static void intersectionOfTwoArray() {
        int [] arr1 = {1,2,2,1};
        int [] arr2 = {2,2};

        HashSet<Integer> hash = new HashSet<>();

        HashMap<Integer, Integer> h1 = new HashMap<>();

        for(int i =0 ; i < arr1.length ; i++) {
            h1.put(arr1[i], h1.getOrDefault(arr1[i],0) + 1);
        }

        for(int i =0 ; i < arr2.length ; i++) {
            if(h1.containsKey(arr2[i])) {
                hash.add(arr2[i]);
            }
        }

       int [] ans = new int[hash.size()];

        Iterator<Integer> iterator = hash.iterator();

        for(int i =0 ; i < ans.length ; i++) {
            ans[i] = iterator.next();
        }


        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }


    public static void main(String[] args) {
//        hashSetBasic();

//        hashMapBasic();

        intersectionOfTwoArray();
    }
}
