import java.util.*;

public class baekjoon_2523_star_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        for(int i = 0; i < 2 * a - 1; i++){
            if(i < a) {
                for(int j = 0; j < i + 1; j++){
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for(int j = i; j < 2 * a - 1; j ++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}