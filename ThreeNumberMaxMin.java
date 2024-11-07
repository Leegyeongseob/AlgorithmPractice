import java.util.Scanner;

public class ThreeNumberMaxMin {
    public static void main(String[] args) {
        // 3개의 번호를 입력받아 최대값과 최소값 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("3개의 숫자 입력 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a,b);
        int maximun = Math.max(max,c);
        int min = Math.min(a,b);
        int minimum = Math.min(min,c);
        System.out.printf("최대값 : %d, 최솟값 : %d",maximun, minimum);
    }
}
