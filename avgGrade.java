import java.util.Arrays;
import java.util.Scanner;

public class avgGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("5명의 점수 입력: ");
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 40){
                arr[i] = 40;
            }
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
