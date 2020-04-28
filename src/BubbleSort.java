// 버블정렬
// 첫번째 자료와 두번째 자료, 두번째 자료와 세번째 자료 ... 마지막-1 번째 자료와 마지막 자료를 비교하여 교환
// 회전 수 마다 큰 수가 뒤로 정렬되기때문에 횟수가 하나씩 줄어든다.

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        //버블 정렬
        int[] arr = {8, 5, 6, 2, 4, 1, 3, 7, 9, 10};
        int k = 0;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                } 
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}