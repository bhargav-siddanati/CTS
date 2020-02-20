import java.util.*;
public class Shrink_String{
    public static void main(String...bhargav){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = sc.nextLine();
        String names[] = name.split(" ");
        for(int i = names.length - 1; i >= 0; i--){
            if( i == names.length - 1)
                System.out.print(names[i] + " ");
            else if( i == 0)
                System.out.print(names[i].charAt(0));
            else
                System.out.print(names[i].charAt(0) + "."); 
        }
    }
}