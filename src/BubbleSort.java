// 버블정렬
// 첫번째 자료와 두번째 자료, 두번째 자료와 세번째 자료 ... 마지막-1 번째 자료와 마지막 자료를 비교하여 교환
// 회전 수 마다 큰 수가 뒤로 정렬되기때문에 횟수가 하나씩 줄어든다.

public class BubbleSort {
    public static void main(String[] args) {
        //버블 정렬
        int[] arr1 = {8, 5, 6, 2, 4, 1, 3, 7, 9, 10};
        int k = 0;

        // 버블정렬 - 기본
        System.out.println("버블정렬 - 기본");
        System.out.println("--------------------------------");
        
        for(int i = 0; i < arr1.length - 1; i++){
            for(int j = 0; j < arr1.length - 1; j++){
                if(arr1[j] > arr1[j + 1]){
                    k = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = k;
                } 
            }
        }
       
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println(" ");

        // 버블정렬 - 중간 종료

        System.out.println("버블정렬 - 중간 종료");
        System.out.println("--------------------------------");

        int[] arr2 = {8, 5, 6, 2, 4, 1, 3, 7, 9, 10};
        int sw = 0;

        for(int i = 0; i < arr2.length - 1; i++){
            sw = 0;
            for(int j = 0; j < arr2.length - 1; j++){
                if(arr2[j] > arr2[j + 1]){
                    k = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = k;
                    sw = 1;
                } 
            }

            if(sw == 0) {
                System.out.println("회전 수 : " + i);
                break;
            }
        }
     
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println(" ");

    }
}