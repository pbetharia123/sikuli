package SikuliTest.sikuli;

public class Test2 {
	public static void main(String[] args) {
		  
	     int n = -5;    
	     if (HelperClass.isValidInteger(n)) 
	         System.out.println("True");
	     else
	         System.out.println("False");
	      
	  
	     String str = "madam";    
	     if (HelperClass.isPalindrome(str)) 
	        System.out.println("True");
	     else
	        System.out.println("False");        
	 }

}
