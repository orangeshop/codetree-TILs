import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        String[] tmp_arr = tmp.split(" ");
        int answer = 0;
        for(int i = 0; i < tmp_arr.length; i++){
            answer += tmp_arr[i].length();
        }
        System.out.println(answer);
    }
}