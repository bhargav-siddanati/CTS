package Inner_classes;

interface interface_class{
	String st = "This is the interface class with anonymous";
	void show();
}

class Anonymous{
	String st = "This is the class with anonymous";
	void display(){}
}
public class AnonymousClass {

	public static void main(String[] args) {
		interface_class in = new interface_class(){

			@Override
			public void show() {
				System.out.println(st);
			}
			
		};
		
		in.show();
		
		Anonymous an = new Anonymous(){
			public void display(){
				System.out.println(st);
			}
		};
		
		an.display();
	}

}
