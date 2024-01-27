import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        int answer = 0;
        while(true){
            String tmp = sc.nextLine();
            if("0".equals(tmp)){ break;}

            if(answer % 2 == 0){
                ls.add(tmp);
            }
            answer++;

        }

        System.out.println(answer);
        for(int i =0; i< ls.size(); i++){
            System.out.println(ls.get(i));
        }
    }
}