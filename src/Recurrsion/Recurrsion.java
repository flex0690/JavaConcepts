package Recurrsion;

public class Recurrsion {
     void func(int n) {
        if (n == 0 ) return;

        System.out.println(n);
        func(n - 1);

        System.out.println(n);
    }
    int sumOfNumbers(int n) {
         if (n == 0 ) return 0;

         return n + sumOfNumbers(n - 1);
    }

    boolean checkForPalindrome(int start, int end , String s) {
        if ( start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) return false;

        return checkForPalindrome(start+1 ,end -1, s);
    }
    int MaxRopeCutting(int rope, int a, int b, int c) {

        if (rope < 0) return -1;

        if (rope == 0) return 0;

         int cutViaA = MaxRopeCutting(rope - a , a, b, c);
         int cutViaB = MaxRopeCutting(rope - b , a, b, c);
         int cutViaC = MaxRopeCutting(rope - c , a, b, c);

         int maxCuts = Math.max(Math.max(cutViaA, cutViaB), cutViaC);

         // If all paths returned -1, this rope can't be cut completely
         if (maxCuts == -1) return -1;

         return 1 + maxCuts;
    }

    void generateSubsets(String s, int currentIndex, int length, String subsetString) {
         if (currentIndex == length) {
             System.out.println(subsetString);
             return;
         }
        // Don't include current character
        generateSubsets(s, currentIndex + 1, length, subsetString);
        // Include current character
        generateSubsets(s, currentIndex + 1, length, subsetString + s.charAt(currentIndex));
    }

    // good problem revise it   https://www.geeksforgeeks.org/dsa/josephus-problem/
    int  josephusProblem(int n, int k) {
         if (n == 1) return 0;

         return (josephusProblem(n-1, k) + k)%n ;
    }
    public void main(String[] args) {

//         func(3);

//        System.out.println(sumOfNumbers(5));

//        String s = "wbklpwm";
//        int start = 0;
//        int end = s.length() - 1;
//        System.out.println(checkForPalindrome(start, end, s));

//        System.out.println(MaxRopeCutting(2,2,2,2));

//        generateSubsets("abc", 0, 3, "");

        System.out.println(josephusProblem(2,3) + 1);


    }
}
