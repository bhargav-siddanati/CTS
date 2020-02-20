import java.util.*;
public class PhoneBook{
    public static void main(String...bhargav){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        LinkedHashMap<String,String> link = new LinkedHashMap<String,String>();
        for( int i = 0; i < n; i++ ){
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the phonenumber");
            String phonenumber = sc.next();
            if(phonenumber.matches("[0-9]{10}")){
                link.put(name,phonenumber);
            }
            else{
                System.out.println("Sorry your enter name is not found");
                // break;
                System.exit(0);
            }
                
        }
        System.out.println("Enter the search");
        int search = n;
        int flag = 0;
        for(int i = 0; i <search; i++ ){
            System.out.println("Enter the name");
            String s = sc.next();
            Iterator<Map.Entry<String,String>> it = link.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String,String> map = it.next();
                if(map.getKey().equals(s)){
                    System.out.println(map.getKey() + "  " + map.getValue());
                    flag = 1;
                    break;
                }
                
            }
            if( flag == 0)
               System.out.println("Sorry your enter name is not found");
        }
        
    
        }

    

    }
