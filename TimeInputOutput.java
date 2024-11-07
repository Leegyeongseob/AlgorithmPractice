import java.util.Scanner;

public class TimeInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력 : ");

        String time = sc.next();
        String[] timeSplit = time.split(":");

        int intHour = Integer.parseInt(timeSplit[0]);
        int intMinute = Integer.parseInt(timeSplit[1]);
        int intSecond = Integer.parseInt(timeSplit[2]);

        if(intHour < 12){
            System.out.printf("오전 %02d시 %02d분 %02d초",intHour,intMinute,intSecond);
        }
        else{
            System.out.printf("오후 %02d시 %02d분 %02d초",intHour-12,intMinute,intSecond);
        }
    }
}
