import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String N_A = sc.nextLine();

        String[] N_A_arr = N_A.split(" ");
        int n = Integer.parseInt(N_A_arr[0]);
        int answer = 0;
        for(int i =0; i<n; i++){
            String tmp = sc.nextLine();
            if(tmp.equals(N_A_arr[1])){
                answer++;
            }
        }
        System.out.print(answer);

    }
}