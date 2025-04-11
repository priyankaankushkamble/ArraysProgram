import java.util.*;
public class SecondLarge//first step
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    int a[]=new int[5];
    int i;
    System.out.println("Enter the array elements");
    for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    }
	int large=Integer.MIN_VALUE;
	int seclarge=Integer.MIN_VALUE;

	for(i=0;i<a.length;i++)	
	{
		if(a[i]>large)
		{
		  seclarge=large;
		  large=a[i];
		}
		else if(a[i]>seclarge && a[i]!=large)
		{
			seclarge=a[i];
		}
	}
	if(seclarge==Integer.MIN_VALUE)
	{
		System.out.println("There is no second large element");
	}
		else
		{
			System.out.println("The second large number is:"+seclarge);
		}
  }
}