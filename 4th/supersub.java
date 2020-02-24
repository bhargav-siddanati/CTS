class Creature {
    String getName() {
        return "Creature";
    }

}

class Bird extends Creature {
    String getName() {
        return "Bird";
    }

    boolean hasFeather() {
        return true;
    }

}

public class supersub {

    public static void main(String[] args) {
        Creature c1 = (Bird) new Bird();
        System.out.println(c1.getName());
        System.out.println(((Bird) c1).hasFeather());
        
        // Creature c2=new Creature();
        // System.out.println(c2.getName());

    }

}
