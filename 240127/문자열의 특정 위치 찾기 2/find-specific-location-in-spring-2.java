import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] ls = {"apple", "banana", "grape", "blueberry", "orange"};

        String tmp = sc.nextLine();
        int answer = 0;
        for(int i =0; i<5; i++){
            for(int k =2; k <= 3; k++){
                if(tmp.equals(ls[i].charAt(k)+"")){
                    System.out.println(ls[i]);
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}