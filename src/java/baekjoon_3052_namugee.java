package java;

import java.util.*;

public class baekjoon_3052_namugee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[42];
        int[] num = new int[10];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 42;
        }

        for (int i = 0; i < 10; i++) {
            arr[num[i] % 42] = num[i] % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 42) {
                cnt++;
            }
        }
        System.out.println(cnt);

        sc.close();
    }

}