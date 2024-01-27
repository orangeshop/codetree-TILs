import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        while(true){
            String tmp = sc.nextLine();
            if("END".equals(tmp)) break;


            for(int i = tmp.length()-1; i >= 0; i--){
                System.out.print(tmp.charAt(i));
            }

            System.out.println();
        }


    }
}