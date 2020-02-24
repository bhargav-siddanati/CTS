import java.util.*;
public class neg_and_odd{
    public static void main(String []args){
        float sum = 0;int count = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter number");
            int data = sc.nextInt();
            if(data > 0 && data % 2 == 0){
                sum -= 0.5f; 
            }
            else if( data < 0){
                System.out.println(sum);
                break;
            }
            else{
                sum += 1;
                count++;
                if(count == 3){
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}