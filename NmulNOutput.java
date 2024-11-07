import java.sql.SQLOutput;
import java.util.Scanner;

public class NmulNOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 n을 입력받아 n * n 출력하기
        System.out.print("정수 n 입력: ");
        int n = sc.nextInt();
        for(int i = 1 ;i <= n*n ;i++){
            System.out.printf("%4d",i);
            if (i % n  == 0 )
                System.out.println();
        }
    }
}
