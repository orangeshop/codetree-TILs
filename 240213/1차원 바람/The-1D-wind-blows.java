import java.util.*;
import java.io.*;
import java.math.*;



public class Main {

    static int[][] board;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String NMQ = br.readLine();
        String[] NMQArr = NMQ.split(" ");
        n = Integer.parseInt(NMQArr[0]);
        m = Integer.parseInt(NMQArr[1]);
        int q = Integer.parseInt(NMQArr[2]);
        
        board = new int[n][m];

        for(int i =0; i < n; i++){
            String tmp = br.readLine();
            String[] tmpArr = tmp.split(" ");

            for(int k =0; k < m; k++){
                board[i][k] = Integer.parseInt(tmpArr[k]);
            }
        }

        String[] ls = new String[q];

        for(int i =0; i < q; i++){
            ls[i] = br.readLine();
            String[] lsSplit = ls[i].split(" ");
            int line = Integer.parseInt(lsSplit[0]);
            String hor = lsSplit[1];
            
            wind(line-1, hor);
        }


        

        
        

    }

    static void wind(int line, String hor){
        
        if(hor.equals("L")){
            int tmp = board[line][m-1];
            for(int i = 0; i < m - 1; i++){
                board[line][i] = board[line][i+1]; 
            }
            board[line][0] = tmp;
        }else{
            int tmp = board[line][0];
            for(int i = m - 1; i > 0; i++){
                board[line][i-1] = board[line][i]; 
            }
            board[line][m] = tmp;
        }

        for(int i =0; i < n; i++){
            for(int k =0; k < m; k++){
                System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < m; i++){
            if(board[line][i] == board[line-1][i] && line != 0){
                // wind(line-1, hor_change(hor));
                break;
            }
        }


    }

    static String hor_change(String input){
        if(input.equals("L")){
            return "R";
        }
        else{
            return "L";
        }
    }
}