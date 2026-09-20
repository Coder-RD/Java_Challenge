import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            // Add number to deque
            deque.addLast(num);

            // Add/update frequency in map
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            // If window exceeds m, remove first element
            if (deque.size() > m) {
                int removed = deque.removeFirst();

                map.put(removed, map.get(removed) - 1);

                if (map.get(removed) == 0) {
                    map.remove(removed);
                }
            }

            // Check unique numbers
            if (deque.size() == m) {
                if (map.size() > maxUnique) {
                    maxUnique = map.size();
                }
            }
        }

        System.out.println(maxUnique);

        in.close();
    }
}