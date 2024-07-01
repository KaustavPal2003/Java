import java.io.*;
class arr
{
	private int[] x;
	public arr()
	{
		x=new int[5];
	}
	public arr(int n)
	{
		x=new int[n];
	}
public void Read()
{
	while(true)
	{
	try
	{
		BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<x.length;i++)
		{
			System.out.println("x["+i+"]=" );
			x[i]=Integer.parseInt(dd.readLine());
		}
		break;
	}
	catch(IOException e)
	{
		System.out.println("input error"+e.getMessage());
		
	}
	catch(ArrayIndexOutOfBoundsException e1)
	{
		System.out.println("over flow");
	}
	catch(NumberFormatException e2)
	{
		System.out.println("invalid format");
		
	}
	finally
	{
		System.out.println("thank you");
	}
	}
}

public void linearsearch(int k)
{
	int i;
	boolean flag=false;
	for(i=0;i<x.length;i++)
	{
		if(x[i]==k)
		{
			flag=true;
			System.out.println("pos="+i);
			break;
		}
	}
	if(flag==false)
		System.out.println("not found");
}

	public static void main (String[] args) throws IOException
	{
	BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("how many no:");
	int m=Integer.parseInt(ds.readLine());
	arr a=new arr(m);
	a.Read();
	System.out.println("enter no for search");
	int k=Integer.parseInt(ds.readLine());
	a.linearsearch(k);
	}
}