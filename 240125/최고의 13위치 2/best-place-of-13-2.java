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

        for(int i =0; i< n; i++){
            String tmp = br.readLine();
            String[] tmp_arr = tmp.split(" ");

            for(int k =0; k< n; k++){
                board[i][k] = Integer.parseInt(tmp_arr[k]);
            }
        }

        int answer = 0;
        for(int i =0; i< n; i++){
            for(int k =0; k< n-2; k++){
                


                for(int j = i; j < n; j++){
                    for(int l = k; l < n-2; l++){
                        if(j == i & l < k + 3) continue;
                        // System.out.println(i + " " + k + " : " + j + " " + l);
                        int clac = board[i][k] + board[i][k+1] + board[i][k+2] + board[j][l] +  board[j][l+1] +  board[j][l+2];
                        answer = Math.max(answer, clac);
                    }
                }


            }
        }

        System.out.println(answer);
         

    }
}