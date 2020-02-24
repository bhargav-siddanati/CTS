import java.util.*;
public class constructor_calling{
    int i=0;
    constructor_calling(){
        System.out.println("lol");
    }
    public static void main(String [] args){
        constructor_calling ss = new constructor_calling();
        System.out.println(ss.i);
    }
}