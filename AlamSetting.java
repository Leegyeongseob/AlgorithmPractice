import java.sql.SQLOutput;
import java.util.Scanner;

public class AlamSetting {
    public static void main(String[] args) {
        // 45분 일찍 알람맞추기
        int hour, min, calc;
        Scanner sc = new Scanner(System.in);
        System.out.print("시간입력(00:00) : ");
        String time = sc.next();
        String[] timeSplit = time.split(":");
        hour = Integer.parseInt(timeSplit[0]);
        min = Integer.parseInt(timeSplit[1]);
        calc = (hour * 60) + min;
        if(calc < 45){
            calc  = (24 * 60) + min;
        }
        calc -= 45;
        System.out.printf("%d:%d\n",(calc/60),(calc%60));
    }
}
