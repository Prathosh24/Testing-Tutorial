package automationdemo;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList();
		System.out.println("initial size array list"+al.size());
		al.add("m");
		al.add("z");
		al.add("a");
		al.add("g");
		System.out.println("size of array list after  adding element "+al.size());
		System.out.println("elements in array list"+al);
		al.add(2, "o");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		ArrayList<String> alstr=new ArrayList();
		alstr.add("c");
		alstr.add("c++");
		alstr.add("java");
		alstr.add("python");
		alstr.add("js");
		System.out.println(alstr);
		alstr.set(4, "java script");
		System.out.println(alstr);
		System.out.println("Elements of the list are");
		for(String lang:alstr) {
			
			System.out.println(lang);
		}
		Iterator itr=alstr.iterator();
		System.out.println("Elements of the list using iterator are");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.addAll(4, alstr);
		System.out.println("adding all the elements of the list alstr to alstr");
		System.out.println(al);
			
		System.out.println(al.isEmpty());
		
	}
}