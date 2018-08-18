package Corejava;

import org.testng.annotations.Test;

public class Palindrom {
  @Test
  public void f() {
	  String str,reverse="";
	  str="madam";
	  System.out.println(str.length());
	  for (int i = str.length()-1; i>=0; i--) {
		  reverse =reverse+str.charAt(i);
		
	}
	  System.out.println(reverse);
	  if (str.equals(reverse)) {
		  System.out.println("Given string is palindrome:"+str);
	  }
		  else {
			  System.out.println("Give string is not a palindrome:"+str);
			
		}
		 
		
	}
  }

