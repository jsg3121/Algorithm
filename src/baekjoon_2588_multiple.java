import java.util.*;

public class baekjoon_2588_multiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int fNum, sNum, multiple = 0;

        fNum = sc.nextInt();
        sNum = sc.nextInt();

        for(int i = 0; i < 3; i++) {
            System.out.println(fNum * (sNum % 10));
            arr[i] = fNum * (sNum % 10);
            sNum /= 10;
        }

        for(int i = 0; i < 3; i++) {
            Math.pow(i, 10);
            multiple += arr[i] * Math.pow(10, i);
        }

        System.out.println(multiple);

        sc.close();
    }    
}