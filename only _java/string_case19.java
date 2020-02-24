import java.util.*;

public class string_case19{
    public static void main(String...args){
        // char a = '2';
        // int b = Integer.valueOf(a);
//         int a = Character.getNumericValue('3');
// int b = Integer.parseInt(String.valueOf('3'));
//         System.out.println(a+ "  " +b);
        System.out.println("Enter size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum = 0;
        String ar[] = new String[n];
        for(int  i = 0; i < n; i++ ){
            System.out.println("Enter string");
            String s = sc.next();
            ar[i] = s;
            for(int j = 0; j < s.length(); j++){
                int c = s.charAt(j);
                if( c >= 48 && c <= 57){
                    sum += Character.getNumericValue(s.charAt(j));
                }
            }
        }

        System.out.println("\n"+sum);
    }
}