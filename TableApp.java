import java.util.*;
class Table
{
	int no;
	Scanner xyz=new Scanner(System.in);
	void setNum()
		
	{
		no=xyz.nextInt();
	}
	
		void printTable()
		{
		for(int i=1;i<=10;i++)
		{
			 System.out.printf("%d\n",no*i);
		}
		}
}
public class TableApp
{
	public static void main(String x[])
	{
	Table t=new Table();
	t.setNum();
	t.printTable();
	}
}