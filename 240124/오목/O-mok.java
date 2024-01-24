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

        for(int i =0; i< 19; i++){
            
            for(int k =0; k<= 15; k++){
                if(board[i][k] == 0) continue;
                if(clac(i,k,board[i][k], board) != 0){
                    
                    return;
                }
            }
        }

        System.out.println(0);
    }

    static int clac(int x, int y, int now, int[][] board){
        Queue<Pair> Q = new LinkedList<>();
        Q.add(new Pair(x,y));

        // 0,0 0,1 0,2
        // 1,0 1,1 1,2
        // 2,0 2,1 2,2
        int[] dx = {0,1,1,-1};
        int[] dy = {1,0,1, 1};

        

        for(int i =0; i < 4; i++){
            int cnt = 1;
            int tmp_x = x;
            int tmp_y = y;
            
            for(int k =0; k< 4; k++){
                int nx = tmp_x + dx[i];
                int ny = tmp_y + dy[i];

                if(nx < 0 || nx >= 19 || ny < 0 || ny >= 19) continue;
                
                if(now == board[nx][ny]){
                    cnt++;
                }
                tmp_x = nx;
                tmp_y = ny;
                
            }

            if(cnt == 5){
                System.out.println(now);
                if(i == 0){
                    System.out.println((x + 1) + " " + (y + 3));
                }
                else if(i == 1){
                    System.out.println((x + 3) + " " + (y + 1));
                }
                 else if(i == 2){
                    System.out.println((x + 3) + " " + (y + 3));
                }
                else if(i == 3){
                    System.out.println((x - 1) + " " + (y + 3));
                }
                
                return now;
            }
        }
        

        return 0;
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