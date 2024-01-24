import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int n = Integer.parseInt(N);
        String tmp = br.readLine();
        int answer = 0;
        for(int i =0; i<tmp.length() -2; i++){
            for(int k = i+1; k < tmp.length()-1; k++){
                for(int j = k + 1; j < tmp.length(); j++){
                    if(tmp.charAt(i) == 'C' & tmp.charAt(k) == 'O' & tmp.charAt(j) == 'W'){
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);

    }
}