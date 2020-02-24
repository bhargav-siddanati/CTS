import java.util.*;

interface LibraryUser {
    void registerAccount();

    void requestBook();
}

class KidUsers implements LibraryUser {
    int age;
    String bookType;
    public void registerAccount(){
        if (age < 12)
            System.out.println("You have successfully registered under a Kids Account");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }
    public void requestBook(){
        if( bookType.equals("Kids") )
            System.out.println("Book Issued successfully, please return the book within 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books");

    }
}

class AdultUser implements LibraryUser {
    int age;
    String bookType;
    public void registerAccount(){
        if (age > 12)
            System.out.println("You have successfully registered under a Adult Account");
        else
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }
    public void requestBook(){
        if( bookType.equals("Fiction") )
            System.out.println("Book Issued successfully, please return the book within 7 days");
        else
            System.out.println("Oops, you are allowed to take only adult Fiction books");

    }
}

public class LibraryInterfaceDemo{
    public static void main(String...bhargav){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many registerations for kids");
        int kidNum = sc.nextInt();

        for( int i = 1; i <= kidNum; i++ ){
            System.out.println("Enter "+ i + " age");
            KidUsers kid = new KidUsers();
            kid.age = sc.nextInt();
            System.out.println("Enter "+ i + " book");
            kid.bookType = sc.next();

            kid.registerAccount();
            kid.requestBook();
        }

        System.out.println("Enter how many registerations for adults");
        int adultNum = sc.nextInt();

        for( int i = 1; i <= adultNum; i++ ){
            System.out.println("Enter "+ i + " age");
            AdultUser adult = new AdultUser();
            adult.age = sc.nextInt();
            System.out.println("Enter "+ i + " book");
            adult.bookType = sc.next();

            adult.registerAccount();
            adult.requestBook();
        }

    }
}
