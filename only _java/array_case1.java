import java.util.*;
import java.math.*;

public class array_case1{
    public static void main(String [] args){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i = 0; i < a.length ; i++ ){
            BigInteger b = new BigInteger(String.valueOf(i));
            if( b.isProbablePrime(1) ){
                System.out.print(a[i] + "  ");
                sum += a[i];
            } 
        }
        System.out.println(sum);
    }
}