import java.util.*;
 public class reversevalue{
     public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt(),re = 0;
        if(n < 0){
            n = Math.abs(n);
            while(n != 0){
                re = re*10 + n%10;
                n /= 10;
            }
            System.out.println(re);
        }
        else{
            while(n != 0){
                re = re*10 + n%10;
                n /= 10;
            }
            System.out.println(re);
        }
        
     }
 }