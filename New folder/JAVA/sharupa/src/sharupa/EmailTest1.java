package sharupa;
import java.util.Scanner;
public class EmailTest1 {

		public boolean isEmail(String email) {

					for (int i = 0;i<=email.length();i++)
					{
					  if((email.charAt(i)>='A' && email.charAt(i)<='z')||(email.charAt(i)>='0' && 
							  email.charAt(i)<='9')|| email.charAt(i)=='@' || email.charAt(i)=='.')
					  {
						  continue;
					  }
					  else
					  {
						 return false;
					  }
					 

		}
				 return true;	} }
		
	

