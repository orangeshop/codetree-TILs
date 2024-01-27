import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        String tmp[] = new String[4];
        for(int i =0; i< 4; i++){
            tmp[i] = sc.nextLine();

        }

        for(int i =4-1; i > -1; i--){
            System.out.println(tmp[i]);

        }
    }
}