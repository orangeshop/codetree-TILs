import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N_M = br.readLine();
        String[] N_M_arr = N_M.split(" ");
        int n = Integer.parseInt(N_M_arr[0]);
        int m = Integer.parseInt(N_M_arr[1]);
        
        String[][] board = new String[n][m];

        for(int i =0; i< n; i++){
            String tmp = br.readLine();
            
            for(int k =0; k< m; k++){
                board[i][k] = tmp.charAt(k) + "";
            }
        }
        int answer = 0;
        for(int i =0; i< n; i++){
            for(int k =0; k< m; k++){
                if(board[i][k].equals("L")){
                    answer += clac(i,k,board, n, m);
                    // System.out.println(answer + " " + i + " " + k);
                }
            }
        }

        System.out.println(answer);

    }

    static int clac(int x, int y, String[][] board, int n, int m){
        int dx[] = {-1,0,1,0,-1,-1,1,1};
        int dy[] = {0,1,0,-1,-1,1,1,-1};
        int answer =0;
        for(int i =0; i < 8; i++){
            int cnt = 1;
            int tmp_x = x;
            int tmp_y = y;
            
            for(int k = 0; k < 2; k++){
                int nx = tmp_x + dx[i];
                int ny = tmp_y + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m) break;
                if(board[nx][ny].equals("E")){
                    cnt += 1;
                }

                tmp_x = nx;
                tmp_y = ny;
                
            }

            if(cnt == 3){
                answer ++;
            }
        }


        return answer;
    }






    static class Pair{
        int x =0;
        int y =0;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}