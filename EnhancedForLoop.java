package OK;

import java.util.*;

public class EnhancedForLoop {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Integer> arrL=new ArrayList<>();    //integer specific
		Collection arrL2=new ArrayList<>();            //any data type 
		arrL2.add("a");
		arrL2.add(2);
		arrL2.add(1.1f);
		for(int i=0;i<5;i++) {
			System.out.println("enter integer");
			arrL.add(in.nextInt());
			
		}
		
		for(int i:arrL) {
			
			System.out.println(i);           //printing
		}
		
		for(Object i: arrL2) {
			System.out.println(i);
		}
		
	}
	

}
