public class OutputPart2 {
    public static void main(String[] args) {
        // 1~1000사이의 7의 배수를 구하고 한줄에 10개 항목씩 출력하기.
        for(int i = 1 ;i <= 1000; i++){
            if(i % 7 == 0){
                System.out.printf("%d ",i);
                if (i % 70 == 0){
                    System.out.println();
                }
            }
        }
    }
}
