import java.util.Scanner;

public class MakeACalculating {
    public static int sumFunc(int a, int b , int c , char Op1){
        switch(Op1){
            case '+':
                return a + b + c;
            case '-':
                return a + b - c;
            case '*':
                return a + b * c;
            case '/':
                return a + b / c;
            default:
                return 0;
        }
    }
    public static int subFunc(int a, int b , int c , char Op1){
        switch(Op1){
            case '+':
                return a - b + c;
            case '-':
                return a - b - c;
            case '*':
                return a - b * c;
            case '/':
                return a - b / c;
            default:
                return 0;
        }
    }
    public static int mulFunc(int a, int b , int c , char Op1){
        switch(Op1){
            case '+':
                return a * b + c;
            case '-':
                return a * b - c;
            case '*':
                return a * b * c;
            case '/':
                return a * b / c;
            default:
                return 0;
        }
    }
    public static int divFunc(int a, int b , int c , char Op2){
        switch(Op2){
            case '+':
                return a / b + c;
            case '-':
                return a / b - c;
            case '*':
                return a / b * c;
            case '/':
                return a / b / c;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        // 정수 3개와 기호 2개를 입력받아 계산기 만들기
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개와 기호 2개 입력 : ");
        int a = sc.nextInt();
        char Op1 = sc.next().charAt(0);
        int b = sc.nextInt();
        char Op2 = sc.next().charAt(0);
        int c = sc.nextInt();

        switch (Op1){
            case '+':
                System.out.println("result:" + sumFunc(a,b,c,Op2));
                break;
            case '-':
                System.out.println("result:" + subFunc(a,b,c,Op2));
                break;
            case '*':
                System.out.println("result:"+ mulFunc(a,b,c,Op2));
                break;
            case '/':
                System.out.println("result"+ divFunc(a,b,c,Op2));
                break;
            default:
                System.out.println("Invaild operator");
        }
        sc.close();
    }
}
