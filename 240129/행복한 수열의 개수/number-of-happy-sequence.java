import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String N_M = sc.nextLine();
        String[] N_M_arr = N_M.split(" "); 
        int n = Integer.parseInt(N_M_arr[0]);
        int m = Integer.parseInt(N_M_arr[1]);
        


        int[][] board = new int[n][n];
        for(int i =0; i < n; i++){
            String tmp = sc.nextLine();
            String[] tmp_arr = tmp.split(" ");
            for(int k =0; k< n; k++){
                board[i][k] = Integer.parseInt(tmp_arr[k]);
            }
        }
        int answer = 0;
        for(int i =0; i<n; i++){
            int ch = 1;
            for(int k =1; k <n; k++){
                if(board[i][k] == board[i][k-1]){
                    ch++;
                }
            }

            if(ch >= m){
                answer++;
            }
        }

        for(int i =0; i<n; i++){
            int ch = 1;
            for(int k =1; k <n; k++){
                if(board[k][i] == board[k-1][i]){
                    ch++;
                }
            }

            if(ch >= m){
                answer++;
            }
        }

        System.out.println(answer);
    }
}