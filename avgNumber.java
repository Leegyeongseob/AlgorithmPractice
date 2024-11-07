import java.util.Scanner;

public class avgNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 성적을 입력하시겠습니까? : ");

        int number = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<number;i++){
            sum += sc.nextInt();
        }
        double avg = (double) sum/number;
        System.out.print("평균은" + avg + "점입니다.");
    }
}
