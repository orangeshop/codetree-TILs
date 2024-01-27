import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        int n = Integer.parseInt(N);
        String answer = "";
        for(int i =0; i < n; i++){
            answer += sc.nextLine();
        }

        System.out.println(answer);

    }
}