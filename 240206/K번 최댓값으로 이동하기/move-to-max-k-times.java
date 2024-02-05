import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N_M = br.readLine();
        String[] N_M_arr = N_M.split(" ");
        int n = Integer.parseInt(N_M_arr[0]);
        int k = Integer.parseInt(N_M_arr[1]);
        
        int[][] board = new int[n][n];

        for(int i =0; i<n; i++){
            String tmp = br.readLine();
            String[] tmp_arr = tmp.split(" ");
            for(int j =0; j < n; j++){
                board[i][j] = Integer.parseInt(tmp_arr[j]);
            }
        }

        String st = br.readLine();
        String[] st_arr = st.split(" ");
        int st_x = Integer.parseInt(st_arr[0]) -1;
        int st_y = Integer.parseInt(st_arr[1]) -1;
        
        Queue<Pair> Q = new LinkedList<>();
        // Q.append(new Pair(Integer.parseInt(st_arr[0]), Integer.parseInt(st_arr[1])));
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        
        for(int i =0; i < k; i++){
            boolean[][] vis = new boolean[n][n];
            
            Q.add(new Pair(st_x, st_y));
            vis[st_x][st_y] = true;
            while(!Q.isEmpty()){
                Pair cur = Q.poll();
                for(int dir = 0; dir < 4; dir++){
                    int nx = cur.x + dx[dir];
                    int ny = cur.y + dy[dir];
                    
                    if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                    if(vis[nx][ny] == true || board[nx][ny] >= board[st_x][st_y]) continue;

                    Q.add(new Pair(nx,ny));
                    vis[nx][ny] = true;

                }
            }

            int max_num = 0;

            for(int j =0; j < n; j++){
                for(int l=0; l< n; l++){
                    if(vis[j][l] == true & board[j][l] < board[st_x][st_y]){
                        max_num = Math.max(max_num, board[j][l]);
                    }
                }
            }

            boolean ch = false;
            for(int j =0; j < n; j++){
                for(int l=0; l< n; l++){
                    if(board[j][l] == max_num){
                        st_x = j;
                        st_y = l;
                        ch = true;
                        break;
                    }
                }
                if(ch == true){
                    break;
                }
            }
            // System.out.println((st_x) + " " + (st_y));

        }

        System.out.println((st_x+1) + " " + (st_y+1));


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