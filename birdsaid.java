import java.util.*;
public class birdsaid{
    public static void main(String [] args){
        System.out.println("Enter the two digit number");
        Scanner sc = new Scanner(System.in);
        int bird_input = sc.nextInt();
        int mod = 0;
        int div ;

        while(bird_input != 0){
            mod += bird_input % 10;
            bird_input = bird_input/10;
        }
        System.out.println("Patrick and Johnny must go "+mod );
    }
}