import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class JuminBirthDaySexAge {
    public static void main(String[] args) {
        //주민등록번호에서 생년월일, 나이, 성별 출력
        int birth, sex,age;
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 13자리 입력(-포함)");
        String jumin = sc.next();
        sc.close();

        String[] juminSplit = jumin.split("-");
        String birthDatePart = juminSplit[0];
        char genderCode = juminSplit[1].charAt(0);

        //생년 계산
        int year = Integer.parseInt(birthDatePart.substring(0,2));
        int month = Integer.parseInt(birthDatePart.substring(2,4));
        int day = Integer.parseInt(birthDatePart.substring(4,6));

        // 성별에 따라 년도계산
        if (genderCode == '1' || genderCode == '2'){
            year += 1900;
        }
        else if(genderCode == '3' || genderCode == '4'){
            year += 2000;
        }
        else System.out.println("간첩입니다.");

        // 현재 연도 가져오기
        int currentYear = LocalDateTime.now().getYear();
        age = currentYear - year;

        // 성별 확인
        String gender = (genderCode == '1' || genderCode == '3') ? "남성" : "여성";

        //출력
        System.out.println("생년월일: " + year + "년" + month + "월"+ day+ "일");
        System.out.println("나이 "+ age + "세");
        System.out.println("성별" + gender);
    }
}

