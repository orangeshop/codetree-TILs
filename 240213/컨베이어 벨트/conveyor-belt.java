import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Deque<Integer> S = new ArrayDeque<>();

        String NM = sc.nextLine();
        String[] NMArr = NM.split(" ");

        int n = Integer.parseInt(NMArr[0]);
        int t = Integer.parseInt(NMArr[1]);
        
        String tmp = sc.nextLine();
        String[] tmpArr = tmp.split(" ");

        for(int i =0; i < tmpArr.length; i++){
            S.add(Integer.parseInt(tmpArr[i]));
        }

        String tmpSecond = sc.nextLine();
        String[] tmpArrSecond = tmpSecond.split(" ");

        for(int i = 0; i < n; i++){
            S.add(Integer.parseInt(tmpArrSecond[i]));
        }

        int[][] board = new int[2][n];


        for(int i =0; i < t; i++){
            int tmp1 = S.pollLast();
            // System.out.println(tmp1);
            S.addFirst(tmp1);
        }

        for(int i =0; i < n; i++){
            board[0][i] = S.pollFirst();
        }
        
         for(int i = 0; i < n; i++){
            board[1][i] = S.pop();
        }


        for(int i =0; i < 2; i++){
            for(int k =0; k < n; k++){
                System.out.print(board[i][k]);
                if(k != n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    
}