package Java110Q2;

import java.util.Scanner;

public class Class02 {
	public void test (int a) { 	            
	       System.out.println("Input a number:"+a);
	       boolean check=true;  
	        for(int i = 2; i < a;i++){  
	        	if(a%i==0){  
	               check=false;  
	               break;}
	        	}    
	        if(check)   
	        	System.out.println(a+" YES");  
	        else   
	        	System.out.println(a+" NO");
	}
}
