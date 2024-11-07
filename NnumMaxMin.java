import java.util.Scanner;

public class NnumMaxMin {
    public static void main(String[] args) {
        // n개의 숫자를 입력하여 Max, Min
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 숫자를 입력하시겠습니까? ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 1 ;i<n ;i++){
            if( min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }
        System.out.println("Max :" + max);
        System.out.println("Min :" + min);
    }
}
