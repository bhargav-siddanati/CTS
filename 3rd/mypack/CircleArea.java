package mypack;
public class CircleArea{
    float radius;
    float pi;
    public CircleArea(){
        radius = 1.5f;
        System.out.println(radius);
    }
    public CircleArea(float pi){
        this();
        this.pi = pi;
       System.out.println(pi);
    }
}