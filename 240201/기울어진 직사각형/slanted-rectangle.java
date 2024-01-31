import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

    Scanner sc = new Scanner(System.in);
    String N = sc.nextLine();
    int n = Integer.parseInt(N);

    int[][] board = new int[n][n];

    for(int i =0; i< n; i++){
        String tmp = sc.nextLine();
        String[] tmp_arr = tmp.split(" ");
        for(int k =0; k < n; k++){
            board[i][k] = Integer.parseInt(tmp_arr[k]);
        }
    }
    int answer = 0;
    for(int i =0; i< n; i++){
        for(int k =0; k<n; k++){
            // System.out.println(i + " " + k);

            List<Pair> ls = new ArrayList<>();
            ls.add(new Pair(i,k));
            for(int j =0; j < n; j++){
                int nx = ls.get(ls.size()-1).x - 1;
                int ny = ls.get(ls.size()-1).y + 1;
                
                if(nx < 0 || nx >= n || ny < 0 || ny >= n) break;

                ls.add(new Pair(nx,ny));
            }
            int size = ls.size();
            for(int j = 0; j < n; j++){
                List<Pair> ls_tmp = new ArrayList<>();
                boolean ch = false;
                for(int l = 0; l < size; l++){
                    int nx = ls.get((ls.size() - size) + l).x - 1;
                    int ny = ls.get((ls.size() - size) + l).y - 1;
                
                    if(nx < 0 || nx >= n || ny < 0 || ny >= n) {
                        ch = true;
                        break;
                    }
                    ls_tmp.add(new Pair(nx,ny));

                }

                
                if(ch == false){
                    int tmp_result = 0;
                    for(int l = 0; l < size; l++){
                        tmp_result += board[ls_tmp.get(l).x][ls_tmp.get(l).y];
                    }

                    
                    int tmp_ls_result = 0;
                    for(int l = 0; l < size; l++){
                        tmp_ls_result += board[ls.get(l).x][ls.get(l).y];
                    }

                    answer = Math.max(answer, tmp_result+tmp_ls_result);

                    ls.add(ls_tmp.get(0));
                    ls.add(ls_tmp.get(ls_tmp.size()-1));
                    

                }

            }
            
            
            
            // System.out.println(answer);
            // break;
        }
        // break;

        
    }
        System.out.println(answer);
    }

    static class Pair{
        int x =0;
        int y =0;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}