import java.util.*;

public class baekjoon_10950_add_3 {
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
            System.out.println(arr[j]);
        }

        sc.close();
    }
    
}