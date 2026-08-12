package comparatorInterface.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceExample2 {
	
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Sumit","Sham","Ram","Kunal","Pavan","Aman");
		System.out.println(str);
		
		Collections.sort(str);
		System.out.println(str);
		
		
		//sort based on length of String
		
		Comparator<String> com = new Comparator<>() {
            public int compare(String a, String b) {
            	
            	if(a.length()>b.length()) {
            		return 1;
            	}else {
            		return -1;
            	}
            	
            }
			
		};
		Collections.sort(str,com);
		System.out.println(str);
		
		
		//sort  decending sort based on length of String
		Comparator<String> com1 = new Comparator<>() {
            public int compare(String a, String b) {
            	
            	if(a.length()<b.length()) {
            		return 1;
            	}else {
            		return -1;
            	}
            	
            }
		};
		Collections.sort(str,com1);
		System.out.println(str);
			
		
		// Lambda Exp  Integer.compare Decending 
			Comparator <String> com4= (b,a)->Integer.compare(a.length(), b.length());
			
			Collections.sort(str,com4);
			System.out.println("Decending  :"+str);
			
		
		//using Lambda Exp  Integer.compare Assending 
		Comparator <String> com3 = (a,b)->Integer.compare(a.length(), b.length());
		
		Collections.sort(str,com3);
		System.out.println("Assending : "+str);
	
		
   }
}


