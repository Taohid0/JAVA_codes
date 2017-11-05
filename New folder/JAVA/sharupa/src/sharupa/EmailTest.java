/*package sharupa;
import java.util.*;

public class EmailTest {
		public static void main(String [] args)
		{
			Scanner scanner = new Scanner(System.in);
			
			while(true)
			{
				boolean flag = false;
				
				String email= scanner.nextLine();
				int len = email.length();
				
				for (int i = 0;i<len;i++)
				{
				  if((email.charAt(i)>='A' && email.charAt(i)<='z')||(email.charAt(i)>='0' && 
						  email.charAt(i)<='9')|| email.charAt(i)=='@' || email.charAt(i)=='.')
				  {
					  continue;
				  }
				  else
				  {
					  flag = true;
					  break;
				  }
				}
				if(email.charAt(len-1)!='m' && email.charAt(len-2)!='0' && email.charAt(len-3)!='c'
						&& email.charAt(len-3)!='.')
				{
					flag =true;
				}
				if(flag)
				{
					System.out.println("This email is invalid");
				}
				else
				{
					System.out.println("This email is valid");
				}
			}
			
		}
}*/
