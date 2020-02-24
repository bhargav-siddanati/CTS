import java.util.*;
public class oddnumber{
    public static void main(String...args){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int flag = 1, sum = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter the number");
            int num = sc.nextInt();
            ar.add(num);
            if(num % 2 != 0){
                if(flag == 1){
                    sum += num;
                    flag = 0;
                }
                else{
                    sum -= num;
                    flag = 1;
                }
            }
        }
        System.out.println(sum);
    }
}