// package FileHandling;
import java.io.*;
public class file{
    public static void main(String...args){
        try{
            File my = new File("D:Filehandle.txt");
            if(my.createNewFile()){
                System.out.println("File "+ my.getName());
            }
            else{
                System.out.println("already");
            }
        }
        catch(Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}