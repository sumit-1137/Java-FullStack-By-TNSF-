package comparatorInterface.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventList {
	public static void main(String[] args) {
		List <Integer> number = Arrays.asList(1,2,5,6,8,7,4);
		
		List<Integer>even = new ArrayList<>(); //
		List<Integer>odd = new ArrayList<>();
		
		for(Integer num : number) {
			if(num %2 ==0) {
				even.add(num);
				
			}else {
				odd.add(num);
				
			}
		}
		// even num 
		System.out.println("Even Number ");
		for(Integer n : even) {
			System.out.print(n +" ");
		}
		
		//odd num
		System.out.println("Odd Number ");
		for(Integer n : odd) {
			System.out.println(n+" ");
		}
		
		//multiply by 2
		List<Integer> listmul = new ArrayList();
		
		for(Integer num : number) {
			listmul.add(num *2);
		}
		
		System.out.println("Multiply by 2  ");
		for(Integer n : listmul) {
			System.out.println(n+" ");
		}
		
		//sumof num
		List<Integer> listsum = new ArrayList();
		int sum =0;
		for(Integer num : number) {
			sum = sum+num;
		}
		System.out.println("Sum Of All Numbers :"+sum);
		
		//Square
		List<Integer> listsquare = new ArrayList();
		for(Integer num : number) {
			listsquare.add(num *num);
		}
		System.out.println("Square  ");
		for(Integer n : listsquare) {
			System.out.print(n+" ");
		}
		
		
		
		
	}

}
