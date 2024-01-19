import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int n = Integer.parseInt(N);

        char[][] board = new char[n][n];
        for(int i =0; i<n; i++){
            String tmp = br.readLine();
            for(int k =0; k < n; k++){
                board[i][k] = tmp.charAt(k);
            }
        }

        String K = br.readLine();
        int k = Integer.parseInt(K);
        int dir = input_dir(k,n);
        int dx[] = {1,0,-1,0};
        int dy[] = {0,-1,0,1};

        Queue<Pair> Q = new LinkedList<>();
        
        int[] arr = out_x_y(k,n,dir);
        
        Q.add(new Pair(arr[0],arr[1]));


        int answer = 0;
        while(!Q.isEmpty()){
            Pair cur = Q.poll();
            // System.out.println(cur.x + " " + cur.y + " " + board[cur.x][cur.y]);
            if(cur.x < 0 || cur.x >= n || cur.y < 0 || cur.y >= n){
                break;
            }
            // System.out.println(cur.x + " " + cur.y + " " + board[cur.x][cur.y]);
            
            int nx = 0;
            int ny = 0;
            if(board[cur.x][cur.y] == '\\'){
                if(dir == 0){
                    dir = 3;

                }
                else if(dir == 1){
                    dir = 2;
                }
                else if(dir == 2){
                    dir = 1;
                }
                else if(dir == 3){
                    dir = 0;
                }
                answer++;
            }
            else if(board[cur.x][cur.y] == '/'){
                if(dir == 0){
                    dir = 1;
                }
                else if(dir == 1){
                    dir = 0;
                }
                else if(dir == 2){
                    dir = 3;
                }
                else{
                    dir = 2;
                }
                answer++;
            }

            nx = cur.x + dx[dir];
            ny = cur.y + dy[dir];
            
            Q.add(new Pair(nx,ny));
            
        }

        // 0,0 0,1 0,2
        // 1,0 1,1 1,2
        // 2,0 2,1 2,2

        // 0 -> 아래로
        // 1 -> 왼쪽
        // 2 => 위로
        // 3 -> 오른
        // for(int i =0; i<n; i++){
        //     for(int j =0; j < n; j++){
        //         System.out.print(board[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println(answer);

    }

    static class Pair{
        int x =0;
        int y =0;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static int[] out_x_y(int k, int n, int m){
        
        int[] arr = new int[2];
        int x =0;
        int y =0;

        if(m == 0){
            x = 0;
            y = k-1;
            // k 1 2 3
            // k 0 1 2
            // n 3
            // 0 1 2
        }else if(m == 1){
            x = (k - n) -1;
            y = n-1;
            // k 4 5 6
            // k 0 1 2
            // n 3
            // 0 1 2
        }else if(m == 2){
            x = n -1;
            y = (k - 2 * n) -1;
            // k 7 8 9
            // k 0 1 2
            // n 3
            // 0 1 2
        }
        else if(m == 3){
            x =  (k - 3 * n) -1;
            y = 0;
            // k 10 11 12
            // k 0 1 2
            // n 3
            // 0 1 2
        }
        

        arr[0] = x;
        arr[1] = y;
        
        return arr;
    }

    public static int input_dir(int k, int n){
        if(1 <= k && k <= n){
            return 0;
        }
        else if(n+1 <= k && k <= n*2){
            return 1;
        }
        else if((n*2)+1 <= k && k <= n*3){
            return 2;
        }
        else if((n*3)+1 <= k && k <= n*4){
            return 3;
        }

        return 4;
    }

}


// \
// 위 -> 오
// 오 -> 위
// 아 -> 왼
// 왼 -> 아

// /
// 아 -> 오
// 오 -> 아
// 왼 -> 위
// 위 -> 왼