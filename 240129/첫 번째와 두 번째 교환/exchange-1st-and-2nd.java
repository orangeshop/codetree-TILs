import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String answer = "";

        String first = a.charAt(0) + "";
        String second = a.charAt(1) + "";
        
        for(int i =0; i < a.length(); i++){
            if(first.equals(a.charAt(i)+"")){
                answer += second;
            }
            else if(second.equals(a.charAt(i)+""))
            {
                answer += first;
            }
            else{
                answer += a.charAt(i);
            }
        }

        System.out.println(answer);
    }
}