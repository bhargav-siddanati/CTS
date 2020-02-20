import java.util.*;
public class positive_and_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int number = sc.nextInt();
        int count = 0, pos_sum = 0;
        for (int i = 0; i < number; i++ ){
            System.out.println("Enter number");
            int positive = sc.nextInt();
            if( positive > 0){
                count++;
                pos_sum = pos_sum + positive;
            }
        }
        System.out.println("Positve Numbers "+count+"\n"+"POsititve Sum "+pos_sum );
    }
}