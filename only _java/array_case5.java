import java.util.*;
public class array_case5{
    public static void main(String...args){
        int a[] =  {1,2,3,4,5};
        int b[] =  {6,7,8,9,10};
        int c[] = new int[a.length];
        int flag = 1;
        if(a.length == b.length){
            for(int i = 0; i < a.length; i++){
                if( flag == 1 ){
                    c[i] = b[i];
                    flag = 0;
                }
                else{
                    c[i] = a[i];
                    flag = 1;
                }
            }
        }
        else{
            System.out.println("two arrays are not same length");
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i] + " ");
        }

    }
}