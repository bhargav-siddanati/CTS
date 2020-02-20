import java.util.*;
public class turns{
    public static void main(String [] args){
        System.out.println("Enter target");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int sum = 0,count = 0;
        while(true){
            if(sum >= target){
                break;
            }
            int turn = sc.nextInt();
 
                sum = sum + turn;
                count++;
                
        }
        System.out.println(count);
    }
}