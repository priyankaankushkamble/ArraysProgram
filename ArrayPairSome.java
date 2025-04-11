import java.util.*;
public class ArrayPairSome//first step
{
	public static void main(String[] args) 
	{
	      Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");//Take array size
		int size=sc.nextInt();
		System.out.println("Enter Array Element");//array  element print
		int a[]= new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Target Value");//print target value for array pair some
		int t=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==t)
				{
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
		

	}

}
	
