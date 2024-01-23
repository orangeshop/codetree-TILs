import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int answer = 0;
        for(int i =0; i < N.length()-2; i++){
            for(int k =i+2; k < N.length()-1; k++){
                if(N.charAt(i) == '('& N.charAt(i+1) == '(' & N.charAt(k) == ')' & N.charAt(k+1) == ')'){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    
    }
}