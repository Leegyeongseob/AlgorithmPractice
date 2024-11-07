import java.util.Scanner;

public class threeNumMaxMin {
    public static void main(String[] args) {
        //  정수 3개 Max, Min
        int a ,b ,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력 : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        System.out.printf("Max 값 : %d\n", max);
        System.out.printf("Min 값 : %d",min);
    }
}
