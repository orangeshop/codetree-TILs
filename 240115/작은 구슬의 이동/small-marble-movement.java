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

        
        if(d == 'L'){
            dir = 0;
        }
        else if(d == 'R'){
            dir = 3;
        }
        else if(d == 'U'){
            dir = 2;
        }
        else if(d == 'D'){
            dir = 1;
        }

        // System.out.println(r + " " + c + " " + dir);


        int dx[] = {0,1,-1,0};
        int dy[] = {1,0,0,-1};
        

        for(int i =0; i<= t; i++){
            r = r + dx[dir];
            c = c + dy[dir];
            
            if(r < 0 || r >= n || c < 0 || c >= n){
                dir = 3 - dir;
                
            }
        }

        
        System.out.println((r+1) + " " + (c+1));
    
    }
}