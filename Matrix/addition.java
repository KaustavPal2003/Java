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

public static matrix add(matrix m1,matrix m2)
{
	if(m1.r==m2.r && m1.c==m2.c)
	{
	matrix u=new matrix(m1.r,m1.c);	
		for(int i=0;i<m1.r;i++)
				{
					for(int j=0;j<m1.c;j++)
						{
							u.x[i][j]=m1.x[i][j]+m2.x[i][j];
						}
				}
				return u;
	}
	else
		return null;
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
	System.out.println("enter row=");
	int r=Integer.parseInt(ds.readLine());
	System.out.println("enter col=");
	int s=Integer.parseInt(ds.readLine());
	matrix m2=new matrix(r,s);
	m2.read();
	m2.display();
	matrix m3=matrix.add(m1,m2);
	m3.display();
	
}
}