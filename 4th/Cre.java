class Creature { 
    void grow() {
    System.out.print("cre");
    }
    
    }
    
    class Bird extends Creature { 
        void fly() {
    System.out.print("bird");
    }
    void hasFeather() {
        System.out.println("lol");
        // return true;
    }
    }
    
    class Falcon extends Bird { 
        void hunt() {
    System.out.print("fal");
    }
    
    }
    
    public class Cre {
    
    public static void main(String[] args) { 
        Creature c1 = new Bird();
        
        // Falcon c2 = new Falcon(); 
        Falcon c3=  (Falcon)c1;
        c3.hunt();
        // c3.fly();
        // Falcon c4=new Creature(); 
        // Bird c5=new Falcon(); 
        // Bird c6=new Creature();
    
    }
    
    }