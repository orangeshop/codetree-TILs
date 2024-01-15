import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = 0;
        int y = 0;
        // 0,0 0,1 0,2
        // 1,0 1,1 1,2
        // 2,0 2,1 2,2
        int dir = 0;
        // 0 이 정면,

        int dx[] = {-1,0,1,0};
        int dy[] = {0,1,0,-1};
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) == 'F'){
                x += dx[dir];
                y += dy[dir];
                

            }else if(str.charAt(i) == 'R'){
                dir += 1;
                if(dir == 4){
                    dir = 0;
                }
            }else if(str.charAt(i) == 'L'){
                dir -= 1;
                if(dir < 0){
                    dir = 0;
                }
            }

        }

        System.out.print(x + " " + y);

    }
}