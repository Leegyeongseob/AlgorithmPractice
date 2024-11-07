import java.util.Scanner;

public class numberOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //[1]서울 [2]경기 [3]인천 [4]수원으로 입력받아 문자열로 출력하기
        System.out.print("원하시는 숫자입력([1]서울 [2]경기 [3]인천 [4]수원) :");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("서울");
                break;
            case 2:
                System.out.println("경기");
                break;
            case 3:
                System.out.println("인천");
                break;
            default:
                System.out.println("수원");
        }

    }
}
