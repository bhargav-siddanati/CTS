import java.util.*;
public class collection8{
    public static String capital(String s, ArrayList<String> ar){
        String s1 = "";
        for(String st : ar){
            String str[] = st.split("_");
            if(str[0].equals(s)){
               s1 =  s1 + str[1];
            }
            else
                s1 = s1 + "not matched";
            
        }
        return s1;
    }
    public static void  main(String...args){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("TN_Chennai");
        ar.add("Kerala_TVM");
        ar.add("Karnataka_BNGLR");
        ar.add("AP_am");
        String s = "AP";
        System.out.println(capital(s,ar));
    }
}