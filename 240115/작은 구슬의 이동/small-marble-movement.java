import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N_T = br.readLine();
        String n_t[] = N_T.split(" ");
        int n = Integer.parseInt(n_t[0]);
        int t = Integer.parseInt(n_t[1]);
        
        String R_C_D = br.readLine();
        String[] R_C_D_arr = R_C_D.split(" ");
        int r = Integer.parseInt(R_C_D_arr[0]);
        int c = Integer.parseInt(R_C_D_arr[1]);
        char d = R_C_D_arr[2].charAt(0);
        int dir = 0;



        r--;
        c--;

        // System.out.println(r + " " + c + " " + d);

        if(d == 'L'){
            dir = 1;
        }
        else if(d == 'R'){
            dir = 3;
        }
        else if(d == 'U'){
            dir = 0;
        }
        else if(d == 'D'){
            dir = 2;
        }

        int dx[] = {-1,0,1,0};
        int dy[] = {0,-1,0,1};
        

        for(int i =0; i< t; i++){
            r = r + dx[dir];
            c = c + dy[dir];
            // System.out.println(r + " " + c);
            if(i == t-1){
                System.out.println((r+1) + " " + (c+1));
            }

            if(r < 0 || r >= n || c < 0 || c >= n){
                if(dir == 0){
                    
                    dir = 2;
                    r = r + dx[dir];
                    c = c + dy[dir];
                    
                }
                else if(dir == 2){
                    dir = 0;
                    r = r + dx[dir];
                    c = c + dy[dir];
                }
                else if(dir == 1){
                    dir = 3;
                    r = r + dx[dir];
                    c = c + dy[dir];
                }
                else if(dir == 3){
                    dir = 1;
                    r = r + dx[dir];
                    c = c + dy[dir];
                }
            }
        }
    }
}