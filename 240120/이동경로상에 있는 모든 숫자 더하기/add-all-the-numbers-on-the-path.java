import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N_T = br.readLine();
        String[] N_T_arr = N_T.split(" ");

        int n = Integer.parseInt(N_T_arr[0]);
        int t = Integer.parseInt(N_T_arr[1]);
        

        String LRF = br.readLine();

        int[][] board = new int[n][n];

        for(int i =0; i<n; i++){
            String tmp = br.readLine();
            String[] tmp_arr = tmp.split(" ");
            for(int k =0; k< n; k++){
                board[i][k] = Integer.parseInt(tmp_arr[k]);
            }
        }

        // System.out.println(n + " " + t);
        // System.out.println(LRF);
        // for(int i =0; i<n; i++){
            
        //     for(int k =0; k< n; k++){
        //         System.out.print(board[i][k] + " ");
        //     }
        //     System.out.println();
        // }

        int now_dir = 1;
        // 0,0 0,1 0,2
        // 1,0 1,1 1,2
        // 2,0 2,1 2,2
        // 왼 위 오 아
        int[] dx = {0,-1,0,1};
        int[] dy = {-1,0,1,0};
        int x = n/2;
        int y = n/2;
        int answer = board[x][y];
        for(int i =0; i<t; i++){
            // System.out.println(x + " " + y + " " + now_dir);
            if(LRF.charAt(i) == 'L'){
                now_dir--;
                if(now_dir < 0){
                    now_dir = 3;
                }
            }
            else if(LRF.charAt(i) == 'R'){
                now_dir++;
                if(now_dir > 3){
                    now_dir = 0;
                }
            }
            else{
                int nx = x + dx[now_dir];
                int ny = y + dy[now_dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n){
                    continue;
                }
                x = nx;
                y = ny;
                answer += board[x][y];
            }
        }

        System.out.println(answer);
        
    }
    static class Pair{
        int x = 0;
        int y = 0;
        Pair(int x, int y){
            this.x = x;
            this.y = y;            
        }
    }
}