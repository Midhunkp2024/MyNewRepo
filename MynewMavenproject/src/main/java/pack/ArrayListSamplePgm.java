package pack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListSamplePgm {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("Midhun");
		a1.add("Vibin");
		a1.add("Suhail");
		a1.add("Aparna");
		a1.add("Appu");
		a1.add("Adam");
		a1.add("Dileep");
		System.out.println(a1);
		String s1=a1.get(3);
		System.out.println(s1);
		boolean s2=a1.contains("Midhun");
		System.out.println(s2);
		int s3=a1.size();
		System.out.println(s3);
		a1.remove(4);
		System.out.println(a1);
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String a:a1) {
			System.out.println("Advanced for loop "+a);
		}
		int i[]= {11,12,13,14};
		for (int a:i) {
			System.out.println(a);
		}
		HashSet<String> set=new HashSet<String>();
		set.add("Mohith");
		set.add("Arun");
		set.add("Vimal");
		set.add("Shaan");
		System.out.println("Hash Set"+set);
		set.remove("Vimal");
		System.out.println(set);
		Iterator<String> itr1=set.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		
		for(String a:set) {
			System.out.println("Advanced for loop "+a);
		

	}

}}
