import java.util.Scanner;

public class numberSwape {
    public static void main(String[] args) {
        //두개의 숫자를 입력받아 스왑하기
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자 입력 :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int tem = a;
        a = b;
        b = tem;
        System.out.printf("%d %d",a,b);
    }
}
