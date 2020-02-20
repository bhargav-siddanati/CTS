import java.util.*;
import java.util.Comparator;
import java.text.*;
class Product{
    int ProductId;
    String ProductName;
    // String DateOfManufacture;
    Date DateOfManufacture;
    int Price;
    Product(int id,String name,String date,int price){
        ProductId = id;
        ProductName = name;
        try{
            DateOfManufacture = new SimpleDateFormat("dd/mm/yyyy").parse(date);
        }
        catch(ParseException e){}
        // DateOfManufacture = date;
        Price = price;
    }
}

 class com{
    
    public void insert(){
        System.out.println("insert");
        
    }

    public void sortByAge(){
        System.out.println("sort");
        
    }

    public static void main(String...args){
        System.out.println("Sorting based on date");
        LinkedList<Product> ll = new LinkedList<Product>();
      
        ll.add(new Product(1, "bhargav", "29/09/1998", 25000));
        ll.add(new Product(2, "bhanu","21/07/1997" , 35000));
        ll.add(new Product(3, "Ram","14/08/1996" , 35100));
        ll.add(new Product(4, "Tulasi", "29/05/1997", 35000));
        Collections.sort(ll, new ByAge1());
        for(Product p : ll){
            System.out.println(p.ProductId + "  " + p.ProductName + "  " + p.DateOfManufacture + "  " + p.Price);
        }
    }
   
}
class ByAge1 implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        return p1.DateOfManufacture.compareTo(p2.DateOfManufacture);
    }
}


