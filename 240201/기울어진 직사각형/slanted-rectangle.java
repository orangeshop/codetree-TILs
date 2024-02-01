import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int n = Integer.parseInt(N);

        int[][] board = new int[n][n];

        for(int i =0; i< n; i++){
            String tmp = sc.nextLine();
            String[] tmp_arr = tmp.split(" ");
            for(int k =0; k < n; k++){
                board[i][k] = Integer.parseInt(tmp_arr[k]);
            }
        }
        int answer = 0;

        for(int i =0; i<n; i++){
            for(int k =0; k < n; k++){
                answer = Math.max(answer, clac(i,k,n,board));
            }
        }

        
        System.out.println(answer);

    }

    static int clac(int x, int y, int max, int[][] board){
        
        int answer = 0;
        for(int mr=1; mr <= max; mr++){
            for(int mc = 1; mc <= max; mc++){
                // System.out.println(mr + " " + mc);
                answer = Math.max(answer, clac_sub(x, y, mr, mc, board, max));

            }
        }
        

        return answer;
    }

    // 0,0 0,1 0,2
    // 1,0 1,1 1,2
    // 2,0 2,1 2,2

    static boolean ch(int nx, int ny, int n){
        if(nx < 0 || nx >= n || ny < 0 || ny >= n){
            return false;
        }
        return true;
    }

    static int clac_sub(int x, int y, int mr, int mc, int board[][], int n){
        int dx[] = {-1,-1,1,1};
        int dy[] = {1,-1,-1,1};
        int nx = x;
        int ny = y;
        int sum = 0;
        for(int i = 0; i < mr; i++){

            nx += dx[0];
            ny += dy[0];
            if(ch(nx, ny, n) == false){
                return -1;
            }
            sum += board[nx][ny];
        }

        for(int i = 0; i < mc; i++){

            nx += dx[1];
            ny += dy[1];
            if(ch(nx, ny, n) == false){
                return -1;
            }
            sum += board[nx][ny];
        }

        for(int i = 0; i < mr; i++){

            nx += dx[2];
            ny += dy[2];
            if(ch(nx, ny, n) == false){
                return -1;
            }
            sum += board[nx][ny];
        }

        for(int i = 0; i < mc; i++){

            nx += dx[3];
            ny += dy[3];
            if(ch(nx, ny, n) == false){
                return -1;
            }
            sum += board[nx][ny];
        }


        return sum;
    }

}