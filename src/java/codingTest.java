package java;

import java.util.*;

public class codingTest {

    public static void main(String[] args) {
        int n = 10;
        String num = Integer.toString(n);

        if (num.length() == 1) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.pow(10, num.length() - 1));
        }

    }

}
