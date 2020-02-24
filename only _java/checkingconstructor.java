public class checkingconstructor{
    int roll;
    String name;
    checkingconstructor(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    public String tostring(){
        return roll + "  " + name;
    }
    public static void main(String [] args){
        checkingconstructor cc = new checkingconstructor(101,"lol");
        System.out.println(cc);
    }
}