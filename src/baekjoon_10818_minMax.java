import java.util.*;

public class baekjoon_10818_minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, arr.length - 1);

        System.out.println(arr[0] + " " + arr[arr.length - 1]);
        sc.close();
    }

    public static void sort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }
}