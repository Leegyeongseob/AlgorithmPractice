import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 구구단 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <10;i++){
            System.out.printf(" %d * %d = %d", n,i,n*i);
            System.out.println();
        }
    }
}
