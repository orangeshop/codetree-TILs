import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        List<Integer> ls = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        int n = Integer.parseInt(N);

        for(int i =0; i<n; i++){
            String tmp = sc.nextLine();

            if(tmp.equals("size")){
                System.out.println(ls.size());
            }
            else if(tmp.equals("pop_back")){
                ls.remove(ls.size()-1);
            }else{
                String[] tmp_arr = tmp.split(" ");
                if(tmp_arr[0].equals("push_back")){
                    ls.add(Integer.parseInt(tmp_arr[1]));

                }else if(tmp_arr[0].equals("get")){
                    System.out.println(ls.get(Integer.parseInt(tmp_arr[1])-1));
                }
            }

        }   





    }
}