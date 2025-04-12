class Sum
{
	int m[];
	void setValue(int a[])
	{
	m=a;
	}
		void showSum()
		{
			int s=0;
			for(int i=0;i<m.length;i++)
			{
			s=s+m[i];
			}
		System.out.printf("Sum of value is %d\n",s);
		}
}
public class ArrayAsParamApp
{
	public static void main(String x[])
	{
		Sum sm=new Sum();
		int arr[]=new int[]{10,20,30,40,50};
		sm.setValue(arr);
		sm.showSum();
	}
}