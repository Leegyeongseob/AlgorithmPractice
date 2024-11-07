import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        System.out.println(func(n));
    }
    static boolean func(int n){
        for(int i =2;i<n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
