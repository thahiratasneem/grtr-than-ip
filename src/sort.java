import java.util.Scanner;


public class sort {
static int i;
	public static void main(String args[])
	{
	int number [] = {20,95,45,86,716};
	int n=number.length;
	System.out.println("the given list are :");
	for(int i=0;i<n;i++)
	{
		System.out.println("" +number[i]);
	}
	System.out.println("enter the no");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	for(int i=0;i<n;i++)
	{
	if(a<number[i])
	{
		System.out.println(""+number[i]);
	}
	}
	 /*if(a!=number[i])
	{
		System.out.println("no element");
	}*/
	
	//sort
	/*for(int i=0;i<n;i++)
	//{
		for (int j=i+1;j<n;j++)
		{
			
			 if (number[i] > number[j])

				 {
				int temp = number[i];
				 number[i]=number[j];
				 number[j]=temp;
				 }
		}
		}
	
	Sy
	stem.out.println("the sorted no are :");
	for( int i=0;i<n;i++)
	{
		System.out.println(" " +number[i]);

	}
	System.out.println("" );

	}*/
}
}

	


