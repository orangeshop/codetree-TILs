import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 여기에 코드를 작성해주세요.

        String N_M = br.readLine();
        String[] N_M_arr = N_M.split(" ");

        int n = Integer.parseInt(N_M_arr[0]);
        int s = Integer.parseInt(N_M_arr[1]);

        int board[] = new int[n];
        String tmp = br.readLine();
        String[] tmp_arr = tmp.split(" ");
        int total_sum  = 0;
        for(int i=0; i<n; i++){
            board[i] = Integer.parseInt(tmp_arr[i]);
            total_sum += board[i];
        }

        int answer = Integer.MAX_VALUE;
        for(int i =0; i<n-1; i++){
            for(int k = i+1; k < n; k++){
                answer = Math.min(answer, Math.abs(s-(total_sum-board[i]-board[k])));
            }
        }

        System.out.println(answer);
    }
}