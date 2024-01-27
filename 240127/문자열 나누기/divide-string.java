import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        int n = Integer.parseInt(N);

        String tmp = sc.nextLine();
        String[] tmp_arr = tmp.split(" ");
        String answer ="";
        for(int i =0; i<n; i++){
            answer += tmp_arr[i];
        }

        for(int i = 0; i< answer.length()/5; i++){
            for(int k =0; k < 5; k++){
                System.out.print(answer.charAt(i*5 + k));
            }
            System.out.println();
        }

        for(int i = 0; i< answer.length()%5; i++){
            System.out.print(answer.charAt( (answer.length()/5)*5 + i));
        }
    }
}