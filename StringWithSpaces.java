import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringWithSpaces {
    public static void main(String[] args) throws IOException {
        // 공백이 있는 문자열 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String test = br.readLine();
        System.out.println(test);
    }
}
