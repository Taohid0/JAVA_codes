
public class NestedSwitch {
			public static void main(String args[])
			{
				int year = 2014;
				int month = 1;
				
				switch(year)
				{
				case 2013 : System.out.println("2013");
				            break;
				case 2014 : System.out.println("2014");
				
				    switch(month)
				    {
				    case 2 : System.out.println("2");
				             break;
				    case 1 : System.out.println("1");
				    }
				   
				}
			}
}
