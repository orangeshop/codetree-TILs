import java.util.*;
import java.io.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String NT = br.readLine();
        String[] NTArr = NT.split(" ");

        int n = Integer.parseInt(NTArr[0]);
        int t = Integer.parseInt(NTArr[1]);

        Deque<Integer> dq = new ArrayDeque<>();
        
        String tmpLineOne = br.readLine();
        String[] tmpLineOneArr = tmpLineOne.split(" ");

        for(int i =0; i < n; i++){
            dq.add(Integer.parseInt(tmpLineOneArr[i]));
        }

        String tmpLineTwo = br.readLine();
        String[] tmpLineTwoArr = tmpLineTwo.split(" ");

        for(int i = 0; i < n; i++){
            dq.add(Integer.parseInt(tmpLineTwoArr[i]));
        }

        String tmpLineThree = br.readLine();
        String[] tmpLineThreeArr = tmpLineThree.split(" ");

        for(int i =0; i < n; i++){
            dq.add(Integer.parseInt(tmpLineThreeArr[i]));
        }

        for(int i =0; i < t; i++){
            int tmpNum = dq.pollLast();
            dq.addFirst(tmpNum);
        }

        int[][] board = new int[3][n];

        for(int i =0; i < 3; i++){
            for(int k =0; k < n; k++){
                board[i][k] = dq.pollFirst();
            }
        }
        
        for(int i =0; i < 3; i++){
            for(int k =0; k < n; k++){
                System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }

    }
}