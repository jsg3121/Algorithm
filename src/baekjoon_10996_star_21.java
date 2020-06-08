import java.util.*;

public class baekjoon_10996_star_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1) {
            System.out.println("*");
        } else {
            for(int i = 0; i < num * 2; i++) {
                for(int j = 0; j < num; j++) {
                    if(i % 2 == 0) {
                        if(j % 2 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else if(i % 2 == 1) {
                        if(j % 2 == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}