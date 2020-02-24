import java.util.*;

public class reverse{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        
        double a=s.nextDouble();
        
        int b=(int)a;
        int c=0,j=0;
        while(b!=0){
           //System.out.println("jai ravi");
           // j=j*10;
           //j+=b%10;
            c++;

            b=b/10;
        }
        System.out.println(c);
        int d=(int)a;
        while(d!=a){
            System.out.print("pa");
            a=a*10;
            d=(int)a;
        }
       int z=0;
        while(d>0){
            if(z==c)
            System.out.print(".");

            j=d%10;
            System.out.print(j);
            d=d/10;
            z++;
        }
       
        //System.out.println(rr);

    } 
}