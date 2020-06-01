import java.util.*;

public class baekjoon_11021_add_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int[] arr = new int[i];

        for(int j = 0; j < i; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[j] = a + b;
        }

        for(int j = 0; j < arr.length; j++) {
            System.out.println("Case #" + (j + 1) + ": " + arr[j]);
        }

        sc.close();
    }
    
}