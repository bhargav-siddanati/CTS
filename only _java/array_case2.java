import java.util.*;
public class array_case2{
    public static void main(String...args){
        int a[] = {1,2,3,4};
        int b[] = {3,4,5,6};
        int ar[]= new int [a.length],count = 0,inc = 0;
        for(int i = 0; i < a.length; i++ ){
            for( int j = 0; j < b.length; j++ ){
                if(a[i] == b[j]){
                    ar[inc] = a[i];
                    inc++;
                    count++;
                }
            }
        }
        System.out.print(count + " ");
        for(int i = 0; i < count; i++){
            System.out.print(ar[i]+ " " );
        }
        for(int i = 0; i < count; i++){
            System.out.print(ar[i]+ " " );
        }
    }
}