import java.util.Scanner;

public class EVENAndOdd {
    public static void main(String[] args) {
        // 짝수인지 홀수인지
        Scanner sc = new Scanner(System.in);
        System.out.print("짝수인지 홀수인지 판별하시오 : ");
        int number = sc.nextInt();

        if (number % 2 == 0 ){
            System.out.print("짝수");
        }
        else{
            System.out.print("홀수");
        }
    }
}
