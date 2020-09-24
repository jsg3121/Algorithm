package java;

import java.io.*;
import java.util.*;

public class baekjoon_10952_add_5 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        while (true) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            } else {
                bw.write(Integer.toString(a + b) + "\n");
            }
        }
        sc.close();
        bw.flush();
        bw.close();
    }

}