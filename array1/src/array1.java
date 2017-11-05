
public class array1 {
		public static void main (String args[])
		{
			int i,j,k=0;
			int twoD[][]=new int [5][5];
			
			for(i=0;i<=5;i++)
			{
				for(j=0;j<=5;j++)
				{
					twoD[i][j]=k++;
				}
			}
			for(i=0;i<=5;i++)
			{
				for(j=0;j<=5;j++){
					System.out.print(" " + twoD[i][j]);
				}
				System.out.println();
		}
}}
