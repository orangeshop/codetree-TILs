import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();

        if(tmp.contains("ee") ){
            System.out.print("Yes ");
        }
        else{
            System.out.print("No ");
        }

        if(tmp.contains("ab") ){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}