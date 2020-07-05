import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // --- Different Test Cases ---

        // foo.bar Test Case: #1 - Invalid List/Key ([-1,-1]) Tester
        // System.out.println("Sum Index: " + Arrays.toString(Solution.solution(new int[]{1, 2, 3, 4}, 15)));

        // foo.bar Test Case: #2 - Starting Index Raiser
        // System.out.println("Sum Index: " + Arrays.toString(Solution.solution(new int[]{4, 3, 10, 2, 8}, 12)));

        // Custom Test Case: Negative Numbers
        // System.out.println("Sum Index: " + Arrays.toString(Solution.solution(new int[]{0, 1, 10, 6, 8, 0, 0, -4}, 20)));
    }

    // l = int[] - Array
    // t = int   - Key
    // j = int   - Sum of multiple values from l, based on i (l[i]). Tested against t to see if the list passes.
    // k = int   - 'Starting Index' - Skips certain values as to get the correct number.
    // i = int   - 'Ending Index' - Used to get the index of values from l to add/subtract from j.

    // Dev Environment Copy: Includes Debug Prints

//    public static int[] solution(int[] l, int t) {
//        System.out.println("-------");
//        System.out.println("[ Starting ]");
//        System.out.println("List: " + Arrays.toString(l));
//        System.out.println("Key: " + t);
//        System.out.println("-------");
//        int k = 0, j = 0;
//        for (int i = 0; i < l.length; i++) {
//            j += l[i];
//            System.out.println("Starting Index: " + k);
//            System.out.println("Ending Index: " + i + " [" + l[i] + "]");
//            System.out.println("Sum: " + j);
//            System.out.println("-------");
//            if (j == t) {
//                return new int[]{k, i};
//            }
//            if (i == l.length - 1) {
//                k++;
//                j = 0;
//                i = k - 1;
//            }
//        }
//        return new int[]{-1,-1};
//    }

//    Submission Copy: Removed Debug Prints

    public static int[] solution(int[] l, int t) {
        int k = 0, j = 0;
        for (int i = 0; i < l.length; i++) {
            j += l[i];
            if (j == t) {
                return new int[]{k, i};
            }
            if (i == l.length - 1) {
                k++;
                j = 0;
                i = k - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
