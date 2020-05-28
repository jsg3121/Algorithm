//삽입 정렬
//두 번째 자료부터 시작하여 그 앞의 자료글과 비교하여 삽입할 위치를 지정한 후 
//자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬하는 알고리즘
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 7};
        int k, i, j;

        
        for(i = 1; i < arr.length; i++) {
            k = arr[i];
            for(j = i - 1; j >= 0; j--){
                if(k < arr[j]){
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = k;
        }

        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

    }

}