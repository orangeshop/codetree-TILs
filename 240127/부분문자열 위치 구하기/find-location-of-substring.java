import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        String tmp1 = sc.nextLine();
        
        int answer = -1;
        for(int i =0; i< tmp.length()-1; i++){
            if((tmp.charAt(i)+"" + tmp.charAt(i+1)).equals(tmp1)){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}