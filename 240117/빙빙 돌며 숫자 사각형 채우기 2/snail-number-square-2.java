import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N_M = br.readLine();
        String N_M_arr[] = N_M.split(" ");
        int n = Integer.parseInt(N_M_arr[0]);
        int m = Integer.parseInt(N_M_arr[1]);
        int board[][] = new int[n][m];
        boolean vis[][] = new boolean[n][m];
        Queue<Pair> Q = new LinkedList<>();
        vis[0][0] = true;
        // 0,0 0,1 0,2
        // 1,0 1,1 1,2
        // 2,0 2,1 2,2
        int dx[] = {1,0,-1, 0};
        int dy[] = {0,1,0, -1};
        int now_dir = 0;
        int cnt = 1;
        board[0][0] = cnt;
        vis[0][0] = true;
        Q.add(new Pair(0,0));
        

        int out_cnt = 0;

        while(!Q.isEmpty()){
            if(out_cnt > n * m * 2) break;
            Pair cur = Q.poll();

            int nx = cur.x + dx[now_dir];
            int ny = cur.y + dy[now_dir];
            
            if(nx < 0 || nx >= n || ny < 0 || ny >= m || vis[nx][ny] == true){
                now_dir++;
                if(now_dir > 3){
                    now_dir = 0;
                }
                out_cnt++;
                Q.add(new Pair(cur.x, cur.y));
                continue;
            }
            // System.out.println(nx + " " + ny);
            Q.add(new Pair(nx, ny));
            vis[nx][ny] = true;
            cnt++;
            out_cnt++;
            board[nx][ny] = cnt;
            
        }

        for(int i =0; i< n; i++){
            for(int k =0; k < m; k++){
                System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }

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