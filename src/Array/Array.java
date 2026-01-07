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



    public void main(String[] args) {
        maxElementInArray();
    }
}
