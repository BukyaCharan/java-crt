1.import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(34);
        q.add(345);
        q.add(58);

        q.poll();
        q.remove();
        System.out.println(q.size());
    }
}







2.import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 9) {
            int temp = n;
            int sum = 0;

            while (temp != 0) {
                int r = temp % 10;
                sum += r;
                temp /= 10;
            }

            n = sum;
        }

        System.out.println(n);
        sc.close();
    }
}





3.import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 0, 1},
            {2, 1, 4},
            {4, 5, 6}
        };

        Queue<Integer> q = new LinkedList<>();

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                q.offer(arr[i][j]);
            }
        }

        
        int[] ans = new int[q.size()];

        int i = 0;

        
        while (!q.isEmpty()) {
            int x = q.poll();
            ans[i] = x;
            i++;
        }

        
        System.out.println(Arrays.toString(ans));
    }
}
