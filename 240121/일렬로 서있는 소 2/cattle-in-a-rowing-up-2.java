import java.util.*;
import java.io.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        String tmp = br.readLine();

        int n = Integer.parseInt(N);
        String[] tmp_arr = tmp.split(" ");
        int[] arr = new int[tmp_arr.length];

        for(int i =0; i< tmp_arr.length; i++){
            arr[i] = Integer.parseInt(tmp_arr[i]);
        }
        int answer = 0;
        for(int i =0; i< arr.length-2; i++){
            for(int j = i+1; j < arr.length-1; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i] <= arr[j] & arr[j] <= arr[k]){
                        answer += 1;
                    }
                }
            }
        }
        System.out.println(answer);

    }
}