package automationdemo;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet hs=	new HashSet();
		hs.add("m");
		hs.add("s");
		hs.add("a");
		hs.add("q");
		hs.add("k");
		System.out.println(hs);
		TreeSet ts=new TreeSet();
		ts.add("m");
		ts.add("s");
		ts.add("w");
		ts.add("a");
		ts.add("k");
		System.out.println(ts);
		Object[] array_data = ts.toArray(); 
		System.out.println("The array is:");   
        for (int i = 0; i < array_data.length; i++)   
            System.out.println(array_data[i]);    
        
        ts.addAll(hs);
        System.out.println(ts);
    }   
 
	


}
