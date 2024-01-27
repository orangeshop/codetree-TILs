import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String tmp1 = sc.nextLine();
        String tmp2 = sc.nextLine();
        String[] tmp1_arr = tmp1.split(" ");
        String[] tmp2_arr = tmp2.split(" ");
        String answer = "";
        for(int i =0; i < tmp1_arr.length; i++){
            answer += tmp1_arr[i];
        }
        
        for(int i =0; i < tmp2_arr.length; i++){
            answer += tmp2_arr[i];
        }
        System.out.print(answer);
    }
}