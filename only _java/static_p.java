class Details{
    int id;
    String name;
    static String clg = "lol";
    Details(int id, String name, String clg){
        this.id = id;
        this.name = name;
        this.clg = clg;
    }
    void dis(){
        System.out.println(id+ "  "+name+ "   "+clg+"  "+new StringBuffer("lol1"));
    }
}
public class static_p{
    public static void main(String []args){
        Details s = new Details(1,"kay","JIT");
        s.dis();
    }
}