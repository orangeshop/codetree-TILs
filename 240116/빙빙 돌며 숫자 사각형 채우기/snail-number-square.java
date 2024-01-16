import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N_M = br.readLine();
        String[] N_M_arr = N_M.split(" ");

        int n = Integer.parseInt(N_M_arr[0]);
        int m = Integer.parseInt(N_M_arr[1]);
        //    01
        // 10 11 12
        //    21

        int dx[] = {0,1,0,-1};
        int dy[] = {1,0,-1,0};

        boolean vis[][] = new boolean[n][m];
        int board[][] = new int[n][m];

        int now_dir = 0;
        Queue<Pair> Q = new LinkedList<>();
        Q.add(new Pair(0,0));
        vis[0][0] = true;
        board[0][0] = 1;
        int cnt = 0;
        while(!Q.isEmpty()){
            if(cnt >= n*m * 2) break;
            Pair cur = Q.poll();
            // System.out.println("x : " + cur.x + " y : " + cur.y + " now " + now_dir);
            int nx = cur.x + dx[now_dir];
            int ny = cur.y + dy[now_dir];
            // System.out.println("nx : " + nx + " ny : " + ny);
            if(nx < 0 || nx >= n || ny < 0 || ny >= m || vis[nx][ny] == true){
                
                now_dir++;
                if(now_dir >= 4){
                    now_dir = 0;
                }
                cnt++;
                Q.add(new Pair(cur.x, cur.y));
                continue;
            }

            board[nx][ny] = board[cur.x][cur.y] + 1;
            cnt++;
            vis[nx][ny] = true;
            Q.add(new Pair(nx,ny));

        }

        for(int i =0; i < n; i++){
            for(int k =0; k< m; k++){
                System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }

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