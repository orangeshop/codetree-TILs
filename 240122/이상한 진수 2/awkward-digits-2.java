import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tmp = br.readLine();

        int[] board = new int[tmp.length()];

        for(int i =0; i< tmp.length(); i++){
            if(tmp.charAt(i) == '0'){
                board[i] =0;
            }
            else{
                board[i] =1;
            }
        }

        for(int i =0; i< tmp.length(); i++){
            if(board[i] == 0){
                board[i] = 1;
                break;
            }
            
        }

        int answer = 0;

        for(int i =0; i< tmp.length(); i++){
            if(board[i] == 1){
                answer += Math.pow(2, (tmp.length()-1) - i);
                // System.out.println(answer);
            }
        }

        System.out.println(answer);
        

    }
}