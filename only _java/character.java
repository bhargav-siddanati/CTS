import java.util.*;
public class character{
    public static ArrayList<String> stringFormed(ArrayList<String> ar){
        HashMap<Character,String> hm = new HashMap<Character,String>();
        hm.put('a',"java");
        hm.put('b',"bat");
        hm.put('c',"car");
        hm.put('d',"dance");
        hm.put('e',"yet");
        hm.put('f',"different");
        hm.put('g',"guts");
        hm.put('h',"hat");
        hm.put('i',"inline");
        hm.put('j',"just");
        hm.put('k',"ok");
        hm.put('l',"live");
        hm.put('m',"more");
        hm.put('n',"nothing");
        hm.put('o',"moon");
        hm.put('p',"poll");
        hm.put('q',"quad");
        hm.put('r',"rog");
        hm.put('s',"soma");
        hm.put('t',"talent");
        hm.put('u',"uv");
        hm.put('v',"visible");
        hm.put('w',"wrapper");
        hm.put('x',"xtra");
        hm.put('y',"notyet");
        hm.put('z',"zip");
        for(int i = 0; i < ar.size(); i++ ){
            String s = ar.get(i);

            if(hm.containsKey(s.charAt(s.length() - 1))){

                ar.set(i,hm.get(s.charAt(s.length() - 1)));
            }
        }
        return ar;
    }
    public static void main(String...args){
        ArrayList<String> ar  = new ArrayList<String>();
        ar.add("ab");
        ar.add("a");
        ar.add("abcd");
        System.out.println(stringFormed(ar));
    }
}