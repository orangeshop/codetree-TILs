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

        int answer = 0;



        answer = make_sq1();
        System.out.println(answer);
        
    }

    static int make_sq1(){
        int answer = Integer.MIN_VALUE;
        for(int i =0; i < n; i++){
            for(int k =0; k < m; k++){

                for(int j = i; j < n; j++){
                    for(int l = k; l < m; l++){
                        
                        answer = Math.max(answer,make_sq2(i,k,j,l));
                        
                    }
                }

            }
        }
        
        return answer;
    }

    static int make_sq2(int x1, int y1, int x2, int y2){
        int answer = Integer.MIN_VALUE;
        
        for(int i =0; i < n; i++){
            for(int k =0; k < m; k++){

                for(int j = i; j < n; j++){
                    for(int l = k; l < m; l++){
                        if(checker(x1, y1, x2, y2, i, k, j, l) == false){
                            answer = Math.max(answer, clac_sum(x1,y1,x2,y2) + clac_sum(i,k,j,l));
                            // System.out.println(clac_sum(x1,y1,x2,y2) + clac_sum(i,k,j,l));
                            // System.out.println();
                        }
                    }
                }

            }
        }
        return answer;
    }

    static int clac_sum(int x1, int y1, int x2, int y2){
        // System.out.println("x1 : " + x1 + " y1 : " + y1 + " x2 : " + x2 + " y2 : " + y2);
        int sum =0;
        for(int i = x1; i <= x2; i++){
            for(int k = y1; k <= y2; k++){
                sum += board[i][k];
            }
        }
        // System.out.println(sum);
        return sum;
    }

    static boolean checker(int x1, int y1, int x2, int y2, int xx1, int yy1, int xx2, int yy2){
        cnt = new int[n][m];
        
        for(int i = x1; i <= x2; i++){
            for(int k = y1; k <= y2; k++){
                cnt[i][k] +=1;
            }
        }

        for(int i = xx1; i <= xx2; i++){
            for(int k = yy1; k <= yy2; k++){
                cnt[i][k] +=1;
            }
        }

        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                if(cnt[i][k] >= 2){
                    return true;
                }
            }
        }
        return false;
    }

}