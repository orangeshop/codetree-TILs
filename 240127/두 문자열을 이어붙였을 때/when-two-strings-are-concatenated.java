import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        if((A+B).equals(B+A)){
            System.out.println("true");
            return;
        }

        System.out.println("false");
    }
}