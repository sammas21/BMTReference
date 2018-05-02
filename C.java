package Algos;

import java.util.Arrays;



public class Multi   {
	


	public static void main(String args[]){ 

		
		String s="";
		Integer [] numArray = {5,10,158,11,6,9,23};
		
		String rty []= new String [numArray.length];
		for(int i=0;i<=numArray.length-1;i++)
		{
			
			 rty[i]=toDecimal(numArray[i].toString());
			
		}
		 
		Arrays.sort(rty);
		
		for(int i=rty.length-1;i>=0;i--)
		{
			s=s+(rty[i].toString().charAt(0)+rty[i].toString().substring(2,rty[i].length() ));
		}
		
		System.out.println(s);
		
		
	}
	
	public static String toDecimal(String test) {
		
		 String u="";
		
		u= test.charAt(0)+"."+test.substring(1, test.length());
		
		
		
		return u;
		
	}
	
	
}

