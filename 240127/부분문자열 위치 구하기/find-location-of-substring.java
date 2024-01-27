import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        String tmp1 = sc.nextLine();
        
        int answer = -1;
        for(int i =0; i< tmp.length()-tmp1.length()+1; i++){
            String tmp2 = "";
            for(int k = i; k < i+tmp1.length(); k++){
                tmp2 += tmp.charAt(k);
                // System.out.println(k);
            }

            // System.out.println(tmp2);

            if(tmp2.equals(tmp1)){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}