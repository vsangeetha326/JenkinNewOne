package org.test;
//While and do While loop difference
public class Task1 {
	
	public static void main(String[] args) {
		
         //	    1
			int a = 10;
			
			//       2
			while (a<=5) {
				//                 3
				System.out.println(a);
				//4
				a++; 
			}
		System.out.println("*********");
		//    1
		int b = 10;
		
		do {
			//                 2
			System.out.println(b);
			//3
			b++;
		} 
		//       4
		while (b<=5);
	}
}
