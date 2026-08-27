import java.util.ArrayList;

class Solution {
    public static void utility(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n; i >= 0; i--) {
            list.add(i);
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
