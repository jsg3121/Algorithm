// 선택정렬 알고리즘
// 배열의 첫번째 주소에 있는 값을 두번째 주소에 있는 값부터 마지막 주소값까지 차례대로 비교하여
// 가장 작은 값을 첫번째 주소값에 놓고 두번째 자료를 세번째부터 마지막까지 비교하는 방식으로 정렬



import java.util.*;

public class SelectSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int k = 0;
        
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++)
        System.out.printf("%d, ",arr[i]);

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }

        System.out.println("정렬 후 결과값");
        for(int i = 0; i < arr.length; i++)
        System.out.printf("%d, ",arr[i]);


        sc.close();
    }
}