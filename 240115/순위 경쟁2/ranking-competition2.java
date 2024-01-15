import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        
        String N = sc.nextLine();
        int n = Integer.parseInt(N);
        int answer = 0;
        int A = 0;
        int B = 0;
        int now_winner = -1;
        for(int i = 0; i< n; i++){
            String tmp = sc.nextLine();
            // System.out.println(answer);
            String[] tmp_arr = tmp.split(" ");

            if(tmp_arr[0].equals("A")){
                A += Integer.parseInt(tmp_arr[1]);
            }
            else{
                B += Integer.parseInt(tmp_arr[1]);
            }
            // 0   0 A,B
            // -1  0 B
            // -1  1 B
            // 0   1 B
            // 1.  1 A, B
            // 1.  3 B
            // 1.  4 B
            // 5.  4 A
            // System.out.println(i + " " + now_winner);
            if(A > B){
                if(now_winner == -1 || now_winner == 1){
                    now_winner = 0;
                    answer += 1;
                }

            }
            else if(A < B){
                if(now_winner == -1 || now_winner == 0){
                    now_winner = 1;
                    answer += 1;
                }
                
            }
            else if(A == B){
                if(now_winner == 0 || now_winner == 1){
                    now_winner = -1;
                    answer += 1;
                }
                
            }
            // System.out.println("A , B " + A + " " + B);
            

        }

        System.out.println(answer);

    }
}