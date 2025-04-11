import java.util.*;
public class MergeTwoArray//first step
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);//scanner class
     int a[]=new int[3];//first array value
     int b[]=new int[3];//second array values
     System.out.println("Enter value in first Array");//print first array value
     for(int i=0;i<a.length;i++)
	{
	  a[i]=xyz.nextInt();
	}
	System.out.println("Enter values in second array");//print second array value
	for(int i=0;i<a.length;i++)
	  {
	    b[i]=xyz.nextInt();
	  }
	  int result[]=getMergeArray(a,b);//for merge a,b
	  System.out.println("Display array after merging");//display array
	  for(int i=0;i<result.length;i++)
	    {
		System.out.printf("%d\t",result[i]);
	    }
   }
	public static int[]getMergeArray(int m[],int n[])
	{
	 int t=0;
	 int k[]=new int[m.length+n.length];	
	 for(int i=0;i<m.length;i++,t++)
	 {
	   k[i]=m[i];
	 }
	  for(int j=0;j<n.length;j++,t++)
	  {
	     k[t]=n[j];
	  }
	    return k;
	}
}
