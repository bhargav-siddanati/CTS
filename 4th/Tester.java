interface Foldable {

    public void fold() throws Exception ;
    
    }
    
    class Paper implements Foldable { 
        public void fold() { 
            System.out.print("Fold");
    }
    
    }
    
    public class Tester {
    
    public static void main(String args []) { 
        try{
            Foldable obj1 = new Paper(); 
            obj1.fold();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    
    Paper obj2 = new Paper(); obj2.fold();
    
    }
    
    }