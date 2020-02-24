import java.util.*;
class multithread implements Runnable{
    public void run(){
        System.out.println("run");
    }
    public static void main(String...args){
        multithread m = new multithread();
        Thread mm = new Thread(m);
        mm.start();
    }
}