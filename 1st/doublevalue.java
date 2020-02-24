import java.util.*;
public class doublevalue{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter double value");
        double num = sc.nextDouble();
        int intvalue = (int)num;
        int result = 0; double copy = num - intvalue; 
    
        // System.out.println("double " + num + " int value " + intvalue + " diff " + copy + " result " + result );
        
        while( copy != 0 ){ //copy != 0
            copy = copy/10;
            System.out.println( copy );
            // copy = copy*10;
            // result = (int)(copy);
            // copy = copy - result;
            
          
            // result = result*10 + (int)(copy);
            // // System.out.println(result + "   " + copy + "");
            // copy = copy - (int)(copy);
            
            // // copy = copy/10;
            // System.out.println(" sub " + result + "   " + copy + "");
            
        }
    }
}