import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N_M = new String();
        try{
            N_M = br.readLine();
        }
        catch(IOException e){

        }
        String[] N_M_arr = N_M.split(" ");
        int n = Integer.parseInt(N_M_arr[0]);
        int m = Integer.parseInt(N_M_arr[1]);

        int[][] board = new int[n][n];
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        for(int i = 0; i< m; i++){
            String R_C = new String();
            try{
                R_C = br.readLine();
            }
            catch(IOException e){

            }
            String[] R_C_arr = R_C.split(" ");
            int r = Integer.parseInt(R_C_arr[0]);
            int c = Integer.parseInt(R_C_arr[1]);
            int cnt =0;
            for(int dir = 0; dir < 4; dir++){
                int nx = (r-1) + dx[dir];
                int ny = (c-1) + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if(board[nx][ny] == 1){cnt++;}
                board[(r-1)][(c-1)] = 1;
            }
            if(cnt == 3){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }

    }
}