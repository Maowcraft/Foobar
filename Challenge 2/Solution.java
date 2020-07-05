import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// I got lazy here, beware the spaghetti code.

public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{13, 5, 6, 2, 5}, new int[]{5, 2, 5, 13}));
        System.out.println(Solution.solution(new int[]{14, 27, 1, 4, 2, 50, 3, 1}, new int[]{2, 4, -4, 3, 1, 1, 14, 27, 50}));
        System.out.println(Solution.solution(new int[]{27, 27, 156, 295, 924, 929, 33, 4}, new int[]{27, 27, 156, 295, 924, 929, 33}));
    }

    public static int solution(int[] x, int[] y) {
        List<Integer> xList = Arrays.stream(x).boxed().collect(Collectors.toList());
        List<Integer> yList = Arrays.stream(y).boxed().collect(Collectors.toList());
        for (int xValue : x) {
            for (int yValue : y) {
                if (!xList.contains(yValue)) {
                    return yValue;
                } else if (!yList.contains(xValue)) {
                    return xValue;
                }
            }
        }
        return 0;
    }
}
