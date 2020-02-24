import java.util.*;
public class offer{
    public static void main(String [] args){
        System.out.println("Enter how many items you want to buy");
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        int sum = 0,least = 0,com = 0;

        System.out.println("Enter "+items+" price");
        for(int i = 0; i < items; i++){
            int entry = sc.nextInt();
            sum = sum + entry;
            if(i==0){
                com = entry;
           }
            else if( i >= 1 ){
                if(com >= entry){
                com = entry;
                }
            }
        }
        
        System.out.println(com);
        int sum1 = sum;
        float disc =  sum * 0.2f;
        float total = sum - disc;
        float total1 = sum1 - com;
        System.out.println(total + " ----"+total1);

        if(total>total1){
            System.out.println("Offer2 is suitable");
        }
        else{
            System.out.println("Offer1 is suitable");
        }

    }
}