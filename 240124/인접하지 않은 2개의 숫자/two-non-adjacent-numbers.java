import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int n = Integer.parseInt(N);

        String tmp = br.readLine();
        String[] tmp_arr = tmp.split(" ");
        int[] board = new int[tmp_arr.length];

        for(int i =0; i<tmp_arr.length; i++){
            board[i] = Integer.parseInt(tmp_arr[i]);
        }
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < board.length-2; i++){
            int tmp1 = 0;
            for(int k = i + 2; k< board.length; k++){
                tmp1 = board[i] + board[k];
            }

            answer = Math.max(answer, tmp1);
        }

        System.out.println(answer);
    }
}