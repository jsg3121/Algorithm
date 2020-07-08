import java.util.*;

public class Main {
    public static void main(String[] args) {

        // int value = (int)(Math.random() * 6) + 1;
        // System.out.println(value);

        // for(int x = 0; x <= 10; x++) {
        //     for(int y = 0; y <= 10; y++) {
        //         if(2 * x + 4 * y == 10){
        //             System.out.println("x = " + x + ", y = " + y);
        //         }
        //     }
        // }

        // String str = "12345";
        // int sum = 0;
        // for(int i = 0; i <str.length(); i++) {
        //     sum += Character.getNumericValue(str.charAt(i));
        //     // sum += str.charAt(i) - '0';
        // }
        // System.out.println("sum = " + sum);

        // int num = 12345;
        // int sum = 0;
        // int size = (int)(Math.log10(num) + 1);

        // for(int i = 0; i < size; i++) {
        //     sum += num % 10;
        //     num /= 10;
        // }
        // System.out.println("sum = " + sum);

        // int num1 = 1, num2 = 1, num3 = 0;

        // System.out.print(num1 + ", " + num2);
        // for(int i = 0; i < 8; i++) {
        //     num3 = num1 + num2;
        //     num1 = num2;
        //     num2 = num3;

        //     System.out.print(", " + num3);
        // }

        String value = "1212344";
        char ch = ' ';
        boolean isNumber = true;

        for(int i = 0; i < value.length(); i++) {
            if(!('0' < value.charAt(i) && value.charAt(i) < '9')){
                isNumber = false;
                break;
            } 
        }

        if(!isNumber) System.out.println("문자열");
        else System.out.println("숫자");
      
    }   

    
}