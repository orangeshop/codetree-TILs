import java.util.*;
import java.math.*;

public class Main {

    static int[][] board;
    static int[][] cnt;
    static int n;
    static int m;
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String nm = sc.nextLine();
        String[] nmArr = nm.split(" ");
        n = Integer.parseInt(nmArr[0]);
        m = Integer.parseInt(nmArr[1]);

        board = new int[n][m];
        cnt = new int[n][m];

        for(int i =0; i < n; i++){
            String tmp = sc.nextLine();
            String[] tmpArr = tmp.split(" ");
            for(int k =0; k < m; k++){
                board[i][k] = Integer.parseInt(tmpArr[k]);
            }
        }

        int answer = -1;



        answer = make_sq1();
        System.out.println(answer);
        
    }

    static int make_sq1(){
        int answer = Integer.MIN_VALUE;
        for(int i =0; i < n; i++){
            for(int k =0; k < m; k++){
                boolean check = false;
                int cnt = 0;
                for(int j=i; j < n; j++){
                    for(int l =k; l < m; l++){
                        if(board[j][l] < 0){
                            check = true;
                            break;
                        }
                        cnt++;
                    }
                    if(check == true){
                        break;
                    }   
                }

                if(check == false){
                    answer = Math.max(answer, cnt);
                }

            }
        }

        return answer;
    }
}