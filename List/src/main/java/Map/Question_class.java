package Map;


import java.util.*;
import java.util.Map.Entry;

public class Question_class {
	private int id;
	private String name;
	private Map<String,String> ans;
	
	public Question_class() {	}
	
	public Question_class(int id, String name, Map<String, String> ans) {
		super();
		this.id = id;
		this.name = name;
		this.ans = ans;
	}
	
	public void display(){
		System.out.println("Question: " + id);
		System.out.println("Name: " + name);
		System.out.println("Answers");
		
		Iterator<Entry<String,String>> it = ans.entrySet().iterator();
		
		while(it.hasNext()){
			Entry<String,String> e = it.next();
			System.out.println(e.getKey() + "         " + e.getValue());
		}
		
	}
	
	
}
