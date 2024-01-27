import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        String tmp2 = sc.nextLine();
        
        
        int answer = 0;
        for(int i = 0; i < tmp.length(); i++){
            if(tmp2.equals(tmp.charAt(i)+"")){
                answer++;
            }
        }

        System.out.println(answer);
    }
}