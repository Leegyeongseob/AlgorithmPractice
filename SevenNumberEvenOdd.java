import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SevenNumberEvenOdd {
    public static void main(String[] args) {
        //(방법 1)
        Scanner sc = new Scanner(System.in);
        System.out.print("7개 숫자입력 :");
        int[] arr = new int[7];
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();


        for(int i = 0;i<arr.length;i++){
            arr[i] =sc.nextInt();
            if (arr[i] % 2== 0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        System.out.print("홀수 : ");
        for(int i:odd){
            System.out.print(i + " ");
        }
        System.out.print("짝수 : ");
        for(int i:even){
            System.out.print(i + " ");
        }
        System.out.println();
        //(방법 2)
        Scanner sc2 = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("7개의 숫자 입력 : ");
        for(int i =0;i<7;i++){
            list.add(sc.nextInt());
        }
        System.out.print("홀수: ");
        list.stream()
                .filter(n -> n % 2 != 0) // 홀수 필터링
                .forEach(e -> System.out.print(e + " ")); // 홀수 출력
        System.out.print("짝수: ");
        list.stream().
                filter(n -> n % 2 == 0).
                forEach(e-> System.out.print(e + " "));
        sc.close();
    }
}
