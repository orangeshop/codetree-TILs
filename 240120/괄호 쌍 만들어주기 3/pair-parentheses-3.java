import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int answer = 0;
        for(int i =0; i<str.length()-1; i++){
            int tmp = 0;
            for(int k = i+1; k< str.length(); k++){
                if(str.charAt(i) == '(' & str.charAt(k) == ')'){
                    tmp++;
                }
            }
            answer += tmp;
        }
        System.out.println(answer);
    }
}