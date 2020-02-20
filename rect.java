import java.util.*;
public class rect{
    public static void main(String [] args){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Enter number");
        int bre = sc.nextInt();
        int rem,total;
        if(len % 8 == 0 && bre % 8 != 0){
            rem = len/8;
        }
        else if(len % 8 != 0 && bre % 8 == 0){
            rem = bre/8;
        }
        else if(len % 8 == 0 && bre % 8 == 0){
            rem = 0;
        }
        else{
            rem = (len/8) + (bre/8) + 1;
        }
        total = (len/8) * (bre/8);
        System.out.println(total + " -- " + rem);
    }
}