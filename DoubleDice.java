import java.util.Scanner;

public class DoubleDice {
    public static void main(String[] args) {
        //더블 다이스 게임
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 주사위 수: ");
        int first = sc.nextInt();
        System.out.print("두번째 주사위 수: ");
        int second = sc.nextInt();

       if(first == second) System.out.println("더블");
       else{
           if((first + second) % 2 == 0 ){
               System.out.println("짝수");
           }
           else{
               System.out.println("홀수");
           }
       }
       sc.close();
    }
}
