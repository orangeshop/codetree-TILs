import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int x = 0;
        int y = 0;
        int answer = -1;
        int now_dir = 0;
        // W E S N
        int dx[] = {0,1,0,-1};
        int dy[] = {1,0,-1,0};
        
        for(int i =0; i< str.length(); i++){
            // System.out.println("x : " + x + " y : " + y);
            if(str.charAt(i) == 'F'){
                x += dx[now_dir];
                y += dy[now_dir];
            }
            else if(str.charAt(i) == 'L'){
                now_dir--;
               
                if(now_dir <= 0){
                    now_dir = 3;
                }
                
            }
            else if(str.charAt(i) == 'R'){
                now_dir++;
                
                if(now_dir >= 4){
                    now_dir = 0;
                }
                
            }

            if(x == 0 && y == 0){
                answer = i+1;
                break;
            }

        }

        System.out.println(answer);
    }
}