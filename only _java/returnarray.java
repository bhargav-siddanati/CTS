import java.util.*;
public class returnarray{
    static int[] getarray(){
        return new int[]{1,2,3,4,5};
    }
    void get(){
        System.out.println("lol");
    }
    public static void main(String [] args){
        new returnarray().get();
        int arr[] = getarray();
        for(int i: arr){
            System.out.println(i);
        }
        int a[][] = new int[3][];
        for(int i = 0; i < a.length; i++){
            a[i] = new int[i+1];
        }
        System.out.println();

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j <  a[i].length; j++){
                a[i][j] = j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}