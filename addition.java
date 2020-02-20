import java.util.*;
public class addition{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float sum = 0;int odd = 0,data;
        while(true){
            System.out.println("Enter number");
            data = sc.nextInt();
            if( data % 2 == 0){
                sum = sum + 0.5f;
            }
            else if(data < 0){
                sum = sum - 1;
            }
            else{
                sum = sum + 1;
                odd++;
                if(odd == 3){
                    System.out.println(sum);
                    break;
                }
            }
            
            
        }

    }
}