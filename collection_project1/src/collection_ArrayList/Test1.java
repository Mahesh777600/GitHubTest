package collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
		
		public static void main(String[] args) {
			
				
		ArrayList al= new ArrayList();
			
			
		
		al.add("pqr");
		al.add(10);
		al.add("abc");
		al.add(20);
		System.out.println(al);
			
				Iterator itr = al.iterator();
					
						while(itr.hasNext())
						{
									Object o = itr.next();
										
									if(o instanceof String s)
									{
										System.out.println(s);
											
										
									}
										
									if(o instanceof Integer i)
									{
											System.out.println(i);
//											int i1=i;	//value convert wrapper class to datatype i1
//										System.out.println(i1);
									}
						}
		}

}
