import java.util.Scanner;

public class InputAndOutPut {
    public static void main(String[] args) {
        // 한번에 정수 여러개 입력 받아서 합계 구하기(입출력과 반복문)
        Scanner sc = new Scanner(System.in);
        System.out.print("정수의 갯수를 입력하세요:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum  += sc.nextInt();
        }
        System.out.println("합계 :"+sum);
    }
}
