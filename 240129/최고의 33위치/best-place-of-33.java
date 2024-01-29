import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        int n = Integer.parseInt(N);
        int[][] board = new int[n][n];
        for(int i =0; i < n; i++){
            String tmp = sc.nextLine();
            String[] tmp_arr = tmp.split(" ");
            for(int k =0; k< n; k++){
                board[i][k] = Integer.parseInt(tmp_arr[k]);
            }
        }
        int answer = 0;

        for(int i =1; i < n-1; i++){
            for(int k =1; k < n-1; k++){
                answer = Math.max(answer, clac(i,k,board));
            }
        }

        System.out.println(answer);
    }


    public static int clac(int x, int y, int[][] board){
        int result = 0;
        result = board[x-1][y-1] 
                + board[x-1][y] 
                + board[x-1][y+1] 
                + board[x][y+1] 
                + board[x+1][y+1]
                + board[x+1][y]
                + board[x+1][y-1]
                + board[x][y-1]
                + board[x][y];        

        return result; 
        // 0,0 0,1 0,2
        // 1,0 1,1 1,2
        // 2,0 2,1 2,2
    }
}