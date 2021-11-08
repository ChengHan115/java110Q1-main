package Java110Q2;
import java.util.Scanner;  
public class Java110Q2 {  
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);  
	    while(sc.hasNext()) {  	            
	        int a = sc.nextInt(); 
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
	}}}