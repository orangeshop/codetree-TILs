import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int n = Integer.parseInt(N);

        String board = br.readLine();
        String[] board_arr = board.split(" ");
        int[] arr = new int[board_arr.length];
        for(int i =0; i< board_arr.length; i++){
            arr[i] = Integer.parseInt(board_arr[i]);
        }

        int answer = Integer.MAX_VALUE;
        for(int i =0; i< arr.length; i++){
            int tmp =0;
            for(int k =0; k< arr.length; k++){
                tmp += Math.abs(i - k) * arr[k];
            }
            answer = Math.min(answer, tmp);
        }
        System.out.println(answer);
    }
}