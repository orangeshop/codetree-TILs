import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int n = Integer.parseInt(N);

        String[] arr = new String[n];

        for(int i =0; i< n; i++){
            String zero = "0000";
            String tmp = br.readLine();
            zero += tmp;

            arr[i] = zero.substring(zero.length()-4, zero.length());
        }

        
        int answer = -1;
        for(int i =0; i<arr.length -2; i++){
            for(int k = i+1; k < arr.length-1; k++){
                for(int j = k + 1; j < arr.length; j++){
                    int max_lenght = Math.max(arr[i].length(), arr[k].length());
                    max_lenght = Math.max(max_lenght, arr[j].length());

                    boolean ch = false;
                    for(int l = 0; l < max_lenght; l++){
                        // System.out.println(arr[i].charAt(l) - 48);
                        if((arr[i].length() <= l ? 0 : arr[i].charAt(l) - 48) + (arr[j].length() <= l  ? 0 : arr[j].charAt(l) - 48) + (arr[k].length() <= l  ? 0 : arr[k].charAt(l) - 48) >= 10){
                            // System.out.println((arr[i].charAt(l) - 48) + " " + (arr[k].charAt(l) - 48) + " " + (arr[j].charAt(l) - 48));
                            ch = true;
                            break;
                        }
                    }

                    if(ch == false){
                        answer = Math.max(answer, Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]) + Integer.parseInt(arr[k]));
                    }

                    // System.out.println(answer);
                    
                }
            }
        }

        System.out.println(answer);


    }
}