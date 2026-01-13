package Array;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Array {

    void maxElementInArray() {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(8);
        arr.add(4);

        System.out.println(Collections.max(arr));
    }

    void SecondLargestElementInArray() {
        List<Integer> arr = new ArrayList<>(List.of(4, 2, 32, 4, 4, 2, 2, 4));

        int largest = arr.getFirst();
        int secondLargest = arr.getFirst();

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i)>largest) {
                secondLargest = largest;
                largest = arr.get(i);
            }
        }

        System.out.println(secondLargest);
    }

    void reverseArray() {
        List<Integer> arr = new ArrayList<>(List.of(3,4,5,3,8,2,5,5,4,10));

        for(int i =0; i<arr.size()/2; i++){
            int item1 = arr.get(i);
            int item2 = arr.get(arr.size()-i-1);

            arr.set(i,item2);
            arr.set(arr.size()-i-1,item1);
        }
        System.out.println(arr);
    }

    void removeDuplicatesFromArray() { // for sorted array only
        List<Integer> arr = new ArrayList<>(List.of(1,1,1,1,2,2,2,2,2));

        int res = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i)!=arr.get(res)) {
                res++;
                arr.set(res,arr.get(i));
            }
        }

        for (int i = 0; i <=res; i++) {
            System.out.println(arr.get(i));
        }
    }

    void moveAllZeroesToEnd() {
        List<Integer> arr = new ArrayList<>(List.of(28,5,0,1,9,2,0,8));
        int l = 0;
        int r = l+1;

        while (r < arr.size()) {

           if (arr.get(l) == 0) {
               if (arr.get(l)!= arr.get(r)) {
                   Collections.swap(arr, l, r);
                   l++;
                   r++;
               } else {
                   r++;
               }
           } else {
               r++;
               l++;
           }
        }

        System.out.println(arr);
    }

    List<Integer> swap(int i, int j, List<Integer> arr) {

        while(i<j) {
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
         return arr;
    }

    void rotateArrayByDPlace() {
        List<Integer> arr = new ArrayList<>(List.of(28,5,0,1,9,2,0,8));
        int d = 10;
        d = d%arr.size();
        arr = swap(0,d-1,arr);
        arr = swap(d,arr.size()-1,arr);

        Collections.reverse(arr);

        System.out.println(arr);




    }



    public void main(String[] args) {
//        maxElementInArray();

//        SecondLargestElementInArray();

//        reverseArray();

//        removeDuplicatesFromArray();

//        moveAllZeroesToEnd();

        rotateArrayByDPlace();
    }
}
