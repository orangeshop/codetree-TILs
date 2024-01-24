import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] board = new int[19][19];

        for(int i =0; i< 19; i++){
            String tmp = br.readLine();
            String[] tmp_arr = tmp.split(" ");
            for(int k =0; k< 19; k++){
                board[i][k] = Integer.parseInt(tmp_arr[k]);
            }
        }

        for(int i =0; i< 15; i++){
            
            for(int k =0; k< 15; k++){
                if(board[i][k] == 0) continue;
                if(clac(i,k,board[i][k], board) != 0){
                    
                    return;
                }
            }
        }

        System.out.println(0);
    }

    static int clac(int x, int y, int now, int[][] board){
        if(board[x][y] == now && board[x+1][y] == now && board[x+2][y] == now && board[x+3][y] == now && board[x+4][y] == now)
        {
            System.out.println(now);
            System.out.println((x + 2 + 1) + " " + (y + 1));
            
            return now;
        }
        else if(board[x][y] == now && board[x][y+1] == now &&board[x][y+2] == now &&board[x][y+3] == now &&board[x][y+4] == now)
        {
            System.out.println(now);
            System.out.println((x + 1) + " " + (y + 2 + 1));

            return now;
        }
        else if(board[x][y] == now && board[x+1][y+1] == now &&board[x+2][y+2] == now &&board[x+3][y+3] == now &&board[x+4][y+4] == now){
            System.out.println(now);
            System.out.println((x + 2 + 1) + " " + (y + 2 + 1));

            return now;
        }
        
        if(x-1 < 0|| x-2 < 0|| x-3 < 0|| x-4< 0){
            return 0;
        }
        
        if(board[x][y] == now && board[x-1][y+1] == now &&board[x-2][y+2] == now &&board[x-3][y+3] == now &&board[x-4][y+4] == now){
            System.out.println(now);
            System.out.println((x -1) + " " + (y + 2 + 1));

            return now;
        }

      

        return 0;
    }
}