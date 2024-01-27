import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        String answer = "";
        for(int i =0; i < tmp.length(); i++){
            if(i == 2 || i == tmp.length()-2){
                answer += "a";
            }
            else{
                answer += tmp.charAt(i);
            }
        }
        

        System.out.println(answer);
    }
}