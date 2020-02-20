import java.util.*;
public class chess{
    public static void main(String [] args){
        System.out.println("Enter number should be greater than 1");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(), sub = 2,count = input,position = 0;
        if(input == 2){
            System.out.println(count);
        }
        else if(input % 2 == 0){
            
            while(position != 2){
                position =  input;
                position -= sub;
                sub += 2; 
                count += position;
            }
            System.out.println(count);
        }
        else{
            
            while(position != 1){
                if( input == 1)
                    break;
                    
                position =  input;
                position -= sub;
                sub += 2; 
                count += position;
            }
            System.out.println(count);
        }
    }
}