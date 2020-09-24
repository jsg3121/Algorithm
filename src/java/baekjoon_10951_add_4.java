package java;

import java.io.*;
import java.util.*;

public class baekjoon_10951_add_4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            bw.write(Integer.toString(a + b) + "\n");
        }
        bw.flush();
        sc.close();
        bw.close();
    }
    // EOF를 사용하여 횟수의 제한이 없을 때 파일을 끝냄
    // Ctrl + z 를 누르면 끝낼 수 있음
}