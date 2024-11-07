import java.util.HashSet;

public class NoMatchLotto {
    public static void main(String[] args) {
        //(방법 1.) 중복이 없는 로또 번호 생성하기
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int val = (int)(Math.random() * 45) + 1;
            set.add(val);
            if(set.size() == 6) break;
        }
        System.out.print(set);

        // (방법 2.)
        int[] lotto = new int[6];
        int val, index = 0;
        boolean isExist = false;
        while(true){
            val = (int)((Math.random()*45)+1);
            for(int i =0 ;i<lotto.length;i++){
                if(lotto[i] == val) isExist = true;
            }
            if(!isExist) lotto[index++] = val;
            if(index == 6) break;
            isExist = false;
        }
        System.out.print("[");
        for (int j= 0 ;j<lotto.length ;j++) {
            System.out.print(lotto[j]);
            if(j < 5){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
