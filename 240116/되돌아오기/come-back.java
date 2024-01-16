import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = -1;
        int x =0;
        int y =0;

        String nn = br.readLine();
        int n = Integer.parseInt(nn);
        //     01
        // -10 00 10
        //     0-1
        // N W S E
        int dx[] = {0,-1,0,1};
        int dy[] = {1,0,-1,0};
        int cnt = 0;
        
        for(int i =0; i < n; i++){
            String M_K = br.readLine();
            String[] M_K_arr = M_K.split(" ");
            int k = Integer.parseInt(M_K_arr[1]);

            for(int j = 0 ; j < k; j++){
                cnt++;
                if(M_K_arr[0].equals("N")){
                    x += dx[0];
                    y += dy[0];
                    if(x == 0 && y == 0){
                        answer = cnt;

                    }

                }
                else if(M_K_arr[0].equals("W")){
                    x += dx[1];
                    y += dy[1];
                    if(x == 0 && y == 0){
                        answer = cnt;
                    }
                }
                else if(M_K_arr[0].equals("S")){
                    x += dx[2];
                    y += dy[2];
                    if(x == 0 && y == 0){
                        answer = cnt;
                    }
                }
                else if(M_K_arr[0].equals("E")){
                    x += dx[3];
                    y += dy[3];
                    if(x == 0 && y == 0){
                        answer = cnt;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}