import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class Product{
    int ProductId;
    String ProductName;
    // Date ManufactureDate;
    String ManufactureDate;
    int Price;
    Product(int id, String name,String date,int rate){
        ProductId = id;
        ProductName = name;
        ManufactureDate = date;
        Price = rate;
    }
}

class Products{
    public static void main(String...args){
        LinkedList<Product> li = new LinkedList<Product>();

            li.add(new Product( 105,"Jockey", "12/09/1900",25000));
            li.add(new Product( 101,"Wrong","13/05/1830" ,35000));
            li.add(new Product( 102,"Pepe Jeans","21/03/1730",45000));
            li.add(new Product( 106,"Flying Machine", "15/06/1870",15000));
            li.add(new Product( 104,"Lee", "28/02/1430",30000));
            li.add(new Product( 103,"LeeCooper", "13/05/1830",45000));

            Collections.sort(li , new Datesort());
            for(Product p : li){
                System.out.println(p.ProductId + "  " + p.ProductName + "  " + p.ManufactureDate + " " + p.Price);
            }

    }
}
class Datesort implements Comparator<Product>{
    
 @Override
 public int compare(Product p1,Product p2){
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
     try{
         int result = df.parse(p1.ManufactureDate).compareTo(df.parse(p2.ManufactureDate));
         if( result == 0){
             return p1.Price - p2.Price;
         }
        else{
            return result; 
        }
     }
     catch(ParseException e){throw new IllegalArgumentException(e);}
        
 }
}