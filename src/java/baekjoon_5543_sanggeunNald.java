package java;

import java.util.*;

public class baekjoon_5543_sanggeunNald {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        int burger = 2000, drink;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (burger > arr[i]) {
                burger = arr[i];
            }
        }

        if (arr[3] > arr[4])
            drink = arr[4];
        else
            drink = arr[3];

        System.out.println(burger + drink - 50);

        sc.close();
    }

}