package String_In_OOP;

import java.util.Arrays;
import java.util.Iterator;

public class StringExample1 {
	
	public static void main(String[] args) {
		String str1 = new String(" abc"); 
		String str2 = "xyz";
		
		String str3 = new String("abc"); 
		System.out.println(str1 == str3); //false 
		
		String str4 = "xyz";
		System.out.println(str2 == str4); //true 
		
		
		str2 = str2 +"xyz"; // changing value 
		System.out.println(str2.toString());
		 
		str3 = str2 + "xyz";
		
		System.out.println(str3.toString());
	    System.out.println(str2.compareTo(str3));
		System.out.println(str1.charAt(0));
		
	
		
		String name [] = new String[5];
		name[0] = "ydy";
		name[1] = "ydy";
		System.out.println(Arrays.toString(name));
		
		
		String line = "This : is : A String";  //splitting 
		String arr[] = line.split(":");
		System.out.println(Arrays.toString(arr));
		
		
		// method in string class 
		System.out.println(str1.charAt(0));
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.trim());
		
		
	}

}
