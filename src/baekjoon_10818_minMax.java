import java.util.*;

public class baekjoon_10818_minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] arr = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min + " " + max);

        sc.close();
    }
}