import java.util.*;
public class permutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int half = sc.nextInt();

        if(half % 2 == 0){
            System.out.println((half/2)+ "  "+(half/2));
        }
        int i = 1,h = half-1;
        System.out.println(i +" -- "+h);
        while( i < half ){
            i++;
            h--;
            if(i == half){
                break;
            }
            System.out.println(i +" -- "+h);
        }
        
        
    }
}