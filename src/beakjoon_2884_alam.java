import java.util.*;

public class beakjoon_2884_alam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int minP = min - 45;

        if(minP < 0){
            
            if(hour == 0) {
                hour = 23;
            } else {
                hour--;
            }

            min += 15;
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + minP);
        }

        sc.close();
    }
    
}