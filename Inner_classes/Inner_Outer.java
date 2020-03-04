package Inner_classes;

public class Inner_Outer {
	
	Inner_Outer(){
		Inn obj = new Inn();
		obj.show();
	}
	
	class Inn{
		String str = "This is the inner class";
		void show(){
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Inner_Outer io = new Inner_Outer();
	}

}
