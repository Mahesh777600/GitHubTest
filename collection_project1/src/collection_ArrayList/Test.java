package collection_ArrayList;

import java.util.*;

public class Test {

	public static void main(String[] args) {
//			List al= new ArrayList();
//			al.add(10);
//			al.add(20);
//			al.add("abc");
//			System.out.println(al);
//				
//			System.out.println(al.size());//3
//				
//			System.out.println(al.isEmpty());//f
//				
//			System.out.println(al.remove(1));
//			
//			System.out.println(al);			
//								
		System.out.println("----------------------------------------------------");
//		List al = new ArrayList();
//			
//				al.add(10);	
//					
//				al.add(20);
//				al.add("abc");
//					
//				Iterator itr= al.iterator();
//				
//				while(itr.hasNext())
//				{
//					Object o = itr.next();
//					
//					System.out.println(o);
//					
//					int i=(int)al.get(0);
//					System.out.println(i);

		System.out.println("---------------------------------------------------");

//		List al= new ArrayList();
//			
//			al.add(10);
//			al.add(20);
//			al.add(30);
//				
//			Iterator 	itr = al.iterator();
//				
//					while(itr.hasNext())
//					{
//							
//						int i	=(int)	itr.next();
//							
//						System.out.println(i);
//			

		List al = new ArrayList();

		al.add("abc");
		al.add("pqr");
		al.add("jkl");

		Iterator itr = al.iterator();

		while (itr.hasNext()) {

			String s = (String) itr.next();

			System.out.println(s);

		}

	}

}
