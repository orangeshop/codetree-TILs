import java.util.*;
import java.io.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int n = Integer.parseInt(N);

        int[][] board = new int[n][n];

        for(int i =0; i < n; i++){
            String tmp = br.readLine();
            String[] tmp_arr = tmp.split(" ");
            for(int k =0; k< n; k++){
                board[i][k] = Integer.parseInt(tmp_arr[k]);
                // System.out.println(tmp);
            }
        }
        int answer = Integer.MIN_VALUE;

        // for(int i =0; i< n; i++){  
        //     for(int k =0; k < n; k++){
        //         System.out.print(board[i][k] + " ");
        //     }
        //     System.out.println();
        // }


        for(int i =0; i< n; i++){  
            int answer_tmp= 0;
            for(int k =0; k < n -2; k++){
                answer_tmp += board[i][k];
                answer_tmp += board[i][k+1];
                answer_tmp += board[i][k+2];
                
            }
            answer = Math.max(answer, answer_tmp);
        }

        System.out.println(answer);
    }
}