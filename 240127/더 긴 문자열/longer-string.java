import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();

        String[] tmp_arr = tmp.split(" ");

        if(tmp_arr[0].length() < tmp_arr[1].length()){
            System.out.println(tmp_arr[1]+" "+tmp_arr[1].length());
            return;
        }
        else if(tmp_arr[0].length() > tmp_arr[1].length()){
            System.out.println(tmp_arr[0]+" "+tmp_arr[0].length());
            return;
        }

        System.out.println("same");


    }
}