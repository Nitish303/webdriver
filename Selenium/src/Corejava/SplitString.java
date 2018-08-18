package Corejava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class SplitString {
  @Test
  public void f() {
	  String str;
	  str= "sridevi,savitri,sunny,archi,nivedha";
	 String[]s=str.split(",");
	  System.out.println(s.length);
	  for (int i = 0; i < s.length; i++) {
		  if (s[i].equalsIgnoreCase("sunny")) {
			  System.out.println(s[i]);
			
		}
		
	}
  }
  

}
