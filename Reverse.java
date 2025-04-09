import java.util.*;
public class Reverse
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the arry size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
			System.out.println("Display the array element");
			for(int i=0;i<size;i++)
			{
					System.out.printf("%d\t",a[i]);
			}
			System.out.println("\n");
				System.out.println("Reverse array is:");
				for(int i=size-1;i>=0;i--)
				{
					System.out.printf("%d\t",a[i]);
				}
	}
}