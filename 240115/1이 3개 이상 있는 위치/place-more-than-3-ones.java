import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        int n = Integer.parseInt(N);
        int[][] board = new int[n][n];
        
        for(int i =0; i< n ; i++){
            String tmp = sc.nextLine();
            String[] tmp_arr = tmp.split(" ");
            for(int k =0; k<n; k++){
                board[i][k] =  Integer.parseInt(tmp_arr[k]);
            }
        }

        int answer= 0;
        int dx[] = {0,1,0,-1};
        int dy[] = {1,0,-1,0};
        
        for(int i =0; i< n ; i++){
            for(int k =0; k<n; k++){
                int cnt = 0;
                for(int dir = 0; dir < 4; dir++){
                    int nx = i + dx[dir];
                    int ny = k + dy[dir];
                    if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

                    if(board[nx][ny] == 1){
                        cnt++;
                    }
                    
                }

                if(cnt >=3){
                    answer++;
                }
            }
        }
        
        System.out.println(answer);
    }

}