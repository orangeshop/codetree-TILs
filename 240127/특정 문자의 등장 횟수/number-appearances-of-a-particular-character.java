import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        int answer1 = 0;
        int answer2 = 0;
        
        for(int i =0; i< tmp.length()-1; i++){
            if((tmp.charAt(i)+"" + tmp.charAt(i+1)).equals("ee")){
                answer1++;
            }

            if((tmp.charAt(i)+"" + tmp.charAt(i+1)).equals("eb")){
                answer2++;
            }
        }

        System.out.println(answer1+ " " + answer2);
    }
}