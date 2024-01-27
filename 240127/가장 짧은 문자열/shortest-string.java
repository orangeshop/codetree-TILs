import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();
        
        System.out.println(Math.min(Math.min(A.length(),B.length()), C.length()));
    
    }
}