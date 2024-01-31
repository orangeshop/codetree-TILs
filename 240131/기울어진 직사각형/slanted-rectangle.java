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

    for(int i =4; i < n; i++){
        for(int k =1; k<n; k++){
            // i-1, k -1
            // i,k
            int tmp_answer = 0;
            for(int j=0; j < n; j++){
                int nx1 = i - j;
                int ny1 = k + j;

                int nx2 = nx1-1;
                int ny2 = ny1-1;
                

                if( nx1 < 0 || nx2 < 0 || ny1 >= n || ny2 >= n){
                    break;
                }
                // System.out.println(nx1 + " " + ny1 + " " + nx2 + " " + ny2);
                tmp_answer += board[i-j][k+j];
                tmp_answer += board[(i-1)-j][(k-1)+j];
                

            }

            answer = Math.max(tmp_answer, answer);
            // break;
        }
        // break;
    }
    
    
    System.out.println(answer);
    
}



static class Pair{
    int x =0;
    int y =0;
    int cnt = 0;
    Pair(int x,int y, int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
}

// 0,0 0,1 0,2
// 1,0 1,1 1,2
// 2,0 2,1 2,2