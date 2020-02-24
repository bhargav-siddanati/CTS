abstract class AirPlane { 
    abstract void fly();

void land() { 
    System.out.print("Landing..");
}

}

 class AirJet extends AirPlane { 
    AirJet() {
super();
}

void fly() { System.out.print("Flying..");

}

// abstract void land() ;
public static void main(String...bhargav){
    AirJet a = new AirJet();
    a.fly();
    a.land();
}

}