import java.util.*;
public class choclates{
    public static void main(String[]args){
        System.out.println("enter choclates");
        Scanner sc = new Scanner(System.in);
        int choc = sc.nextInt(); 
        System.out.println("enter number of childrens");
        int child = sc.nextInt();
        int i,j=0;
        for(i = 1; i <= child; i++ ){
            j = j+i;
            if( j<= choc ){
            }
            else{
                j -= i;
                break;
            }
        }
    
        System.out.println("out of "+child+" choclates recieved "+(i-1)+"person");
        System.out.println("remainig choclates "+ (choc - j));
    }
}