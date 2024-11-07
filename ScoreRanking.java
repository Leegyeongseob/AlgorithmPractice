import java.util.Scanner;

public class ScoreRanking {
    public static void main(String[] args) {
        // 학점 계산하기
        Scanner sc = new Scanner(System.in);
        System.out.print("학점을 입력(점): ");
        int grade = sc.nextInt();

        if(grade >= 90){
            System.out.println("A학점");
        }
        else if(grade >= 80){
            System.out.println("B학점");
        }
        else if(grade >= 70){
            System.out.println("C학점");
        }
        else if(grade >= 60){
            System.out.println("D학점");
        }
        else{
            System.out.println("F학점");
        }

    }
}
