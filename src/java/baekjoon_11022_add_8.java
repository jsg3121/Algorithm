package java;

import java.util.*;

public class baekjoon_11022_add_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr1 = new int[a];
        int[] arr2 = new int[a];

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr1[i] = x;
            arr2[i] = y;
        }

        for (int i = 0; i < a; i++) {
            System.out.println("Case #" + (i + 1) + ": " + arr1[i] + " + " + arr2[i] + " = " + (arr1[i] + arr2[i]));
        }

        sc.close();

    }

}