import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int n = Integer.parseInt(N);
        int[] board = new int[n];
        for(int i = 0; i< n; i++){
            String tmp = br.readLine();
            int tm = Integer.parseInt(tmp);
            board[i] = tm;
        }

        int answer = Integer.MAX_VALUE;

        for(int i = 0; i< n; i++){
            int tmp = 0;

            for(int k = 0; k< n; k++){
                if(i == k) continue;
                if(i > k){
                    // i = 2
                    // n = 5

                    tmp += ((n-i)+k) * board[k];
                }else{
                    tmp += Math.abs(i - k) * board[k];
                    
                }
                // System.out.println(tmp);
            }
            // System.out.println("---------------");
            answer = Math.min(answer, tmp);   
        }

        System.out.println(answer);

    }
}