import java.util.*;
import java.io.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N_M = br.readLine();
        String[] N_M_arr = N_M.split(" ");

        int n = Integer.parseInt(N_M_arr[0]);
        int m = Integer.parseInt(N_M_arr[1]);

        char[][] board = new char[n][m];

        for(int i =0; i < n; i++){
            String tmp = br.readLine();
            String[] tmp_arr = tmp.split(" ");
            for(int k =0; k< m; k++){
                board[i][k] = tmp_arr[k].charAt(0);
                // System.out.println(tmp);
            }
        }
        int answer = 0;

        Queue<Pair> Q = new LinkedList<>();

        Q.add(new Pair(0,0,0, board[0][0]));

        while(!Q.isEmpty()){
            Pair cur = Q.poll();
            // System.out.println(cur.x + " " + cur.y + " " + cur.cnt + " " + cur.board);
            if(cur.x == n-1 && cur.y == m-1 && cur.cnt == 3){
                answer++;
            }
            for(int i = cur.x+1; i < n; i++){

                for(int k =cur.y+1; k < m; k++){

                    if(board[i][k] != cur.board){
                        Q.add(new Pair(i,k,cur.cnt+1,board[i][k]));
                    }

                }

            }


        }

        System.out.println(answer);


    }

    static class Pair{
        int x = 0;
        int y = 0;
        int cnt = 0;
        char board;
        Pair(int x, int y, int cnt, char board){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.board = board;
        }
    }
}