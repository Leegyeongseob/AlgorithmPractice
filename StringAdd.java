import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("s 문자 입력: ");
        String s = sc.nextLine();
        System.out.print("k 문자 입력: ");
        String k = sc.nextLine();
        System.out.print("n 숫자 입력 : ");
        int n = sc.nextInt();

        int pos = s.length() - n;
        String sub = s.substring(pos);
        System.out.println(sub + k);
    }
}
