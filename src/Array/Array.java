package Array;

import java.util.ArrayList;
import java.util.Collections;
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

        int largest = arr.get(0);
        int secondLargest = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i)>largest) {
                secondLargest = largest;
                largest = arr.get(i);
            }
        }

        System.out.println(secondLargest);
    }



    public void main(String[] args) {
//        maxElementInArray();

        SecondLargestElementInArray();
    }
}
