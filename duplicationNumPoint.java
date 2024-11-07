import java.util.Scanner;

public class duplicationNumPoint {
    public static void main(String[] args) {
        //10개의 배열에 중복된 숫자 입력 후 2번째 숫자 위치 찾기
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        System.out.print("10개의 중복되는 임의의 숫자 입력 :");
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("두번째 찾을 수 입력:" );
        int findNum = sc.nextInt();
        for(int i =0 ;i<arr.length;i++){
            if(arr[i] == findNum){
                cnt ++;
                if(cnt == 2){
                    System.out.println(i+1);
                    break;
                }
            }
        }
        if(cnt < 2) System.out.println("-1");
    }
}
