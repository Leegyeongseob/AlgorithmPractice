import java.util.Scanner;

public class OuterTypesInputOutput {
    public static void main(String[] args) {
        //이름, 주소, 전화번호, 성별을 입력받아 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("주소를 입력하세요: ");
        String address = sc.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phone = sc.nextLine();
        System.out.print("성별을 입력하세요: ");
        String sex = sc.nextLine();

        System.out.println("\n입력한 정보");
        System.out.println("이름: " + name);
        System.out.println("주소: " + address);
        System.out.println("전화번호: " + phone);
        System.out.println("성별: " + sex);

        sc.close();
    }
}
