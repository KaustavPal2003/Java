import java.io.*;
class matrix
{
	private int[][] x;
	private int r,c;
	public matrix()
	{
		r=3;
		c=3;
		x=new int[r][c];
	}
	public matrix(int m,int n)
	{
		this.r=m;
		this.c=n;
		x=new int[r][c];
	}
	public void read()
	{
		try
		{
			BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
			for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
						{
							System.out.println("x["+i+"]["+j+"]=");
							x[i][j]=Integer.parseInt(ds.readLine());
						}
		}
	}
	catch(IOException e)
	{
		System.out.println("input error"+e.getMessage());
		
	}
}

public void display()
{
	System.out.println("matrix : ");
	for(int i=0;i<x.length;i++)
				{
					for(int j=0;j<x[0].length;j++)
						{
							System.out.print(x[i][j]+"  ");
						}
						System.out.println();
				}
}

public matrix transpose()
{
	matrix u=new matrix(c,r);
	for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
						{
							u.x[j][i]=this.x[i][j];
						}
				}
				return u;
}

	public static void main (String[] args) throws IOException
	{
	BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter row=");
	int p=Integer.parseInt(ds.readLine());
	System.out.println("enter col=");
	int q=Integer.parseInt(ds.readLine());
	matrix m1=new matrix(p,q);
	m1.read();
	m1.display();
	matrix m2=m1.transpose();
	m2.display();
	}
}
