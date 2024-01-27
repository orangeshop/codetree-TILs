import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        String[] tmp_arr = tmp.split(" ");

        for(int i =0; i< tmp_arr[0].length(); i++){
            if((tmp_arr[0].charAt(i)+"").equals(tmp_arr[1])){
                System.out.print(i);
                return;
            }
        }

        System.out.print("No");

    }
}