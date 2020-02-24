import java.util.*;
class multi extends Thread{
    public void run(){
        System.out.println("run");
    }
    public static void main(String...args){
        multi m = new multi();
        m.start();
    }
}