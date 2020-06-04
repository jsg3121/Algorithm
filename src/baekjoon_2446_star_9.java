import java.util.*;
import java.io.*;

public class baekjoon_2446_star_9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String star = "*";
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < 2 * count - 1; i++){
            if(i < count) {
                int a = i * 2;
                for(int j = 0; j < i; j++){
                    bw.write(" ");
                }
                for(; a < 2 * count - 1; a++){
                    bw.write(star);
                }
                bw.write("\n");
            } else {
                for(int j = i + 1; j < 2 * count - 1; j++) {
                    bw.write(" ");
                }
                for(int j = 2 * count - 1; j < 2 ; j--) {
                    bw.write(star);
                }
                bw.write("\n");
            }
        }
        
        bw.flush();
        bw.close();
    }    
}