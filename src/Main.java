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

        // String value = "1212344";
        // char ch = ' ';
        // boolean isNumber = true;

        // for(int i = 0; i < value.length(); i++) {
        //     if(!('0' < value.charAt(i) && value.charAt(i) < '9')){
        //         isNumber = false;
        //         break;
        //     } 
        // }

        // if(!isNumber) System.out.println("문자열");
        // else System.out.println("숫자");
      

        int dan = 2;  // 2단, 3단, 4단 ... 9단 실제 콘솔창에 들어갈 수
        int dan2 = 2; // 3까지 곱하고 다음 줄에 들어갈 시작 수 
                      // ex) 첫째줄 2단, 둘째줄 5단, 셋째줄 8단 이라는 것을 지정해줍니다 구구단 내용에 바로 적용은 안됩니다

        for(int x = 1; x <= 3 ; x++) { //2단, 5단, 8단을 시작하기 위한 3번의 반복
            
            for(int i = 1; i <= 3; i++) { // x * y 에서 y부분을 1에서 3까지 반복 i <= 3을 i <= 9로 바꿔주면 모든 단이  * 9까지 나와요

                for(int j = 0; j < 3; j++) { //2단에서 4단까지, 5단에서 7단까지 3번씩 반복해주는 조건식
                                             // 2 * 1에서 4 * 3까지 3개를 3줄 반복
                    
                    if(dan != 10){ // 문제에서는 10단은 나오지 않고 9단까지 나왔기 때문에 10일 경우에는 입력하지 않도록 조건을 걸어줍니다

                        System.out.print(dan + " * " + i + " = " + i * dan + "\t");
                        dan++; // 첫번째 구역에서 앞에 있는 수를 +1 해줍니다 ex) x * y 에서 x 부분
                               // 2 * 1 이 끝나면 바로 옆에 3 * 1이 들어가고 그 옆에 4 * 1이 들어가야 하기 때문
                    }

                }
                
                dan = dan2; // 3까지 곱해야 하기 때문에 다시 처음 수로 돌아갑니다 ex) 4 * 1 가 끝나고 2 * 2로 갈 때 x(앞자리 수)를 다시 2로 초기화
                            // 2 * 1에서 4 * 1까지 끝나고 다음줄에 다시 2 * 2가 되어야 하기 때문
                System.out.println(); // 3까지 곱해주었기 때문에 여백을 넣어줍니다

            }

            dan2 += 3; // 4단까지 끝나고 새로 시작될 부분에 첫번째로 시작 되는 수를 전역변수로 선언해줍니다
            dan = dan2; // 첫번째 시작되는 수를 반복문에 적용시킵니다
            System.out.println();
        }

    }   

    
}