import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int n = Integer.parseInt(N);
        List<Pair> ls = new ArrayList<>();

        for(int i = 0; i< n; i++){
            String tmp = br.readLine();
            String[] tmp_arr = tmp.split(" ");
            int x = Integer.parseInt(tmp_arr[0]);
            int y = Integer.parseInt(tmp_arr[1]);

            ls.add(new Pair(x,y));
        }
        int answer = Integer.MAX_VALUE;
        for(int i =1; i< ls.size()-1; i++){
            int now_x = ls.get(0).x;
            int now_y = ls.get(0).y;
            
            int result = 0;
            for(int k =1; k < ls.size(); k++){
                if(k == i) continue;
                result += clac(now_x, ls.get(k).x, now_y,ls.get(k).y);
                now_x = ls.get(k).x;
                now_y = ls.get(k).y;
            }
            // System.out.println(result);
            answer = Math.min(answer, result);
        }

        System.out.println(answer);

    }

    static class Pair{
        int x = 0;
        int y = 0;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int clac(int x1, int x2, int y1, int y2){
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}