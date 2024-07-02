class overloading
{
	public void tri(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	public void tri(int n,char c)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print(c);
			System.out.println();
		}
	}
	public void tri(String s)
	{
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=n-i;k++)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
				System.out.print(s.charAt(j)+" ");
			System.out.println();
		}
	}
	public static void main (String[] args) {
		overloading o1=new overloading();
		o1.tri(4);
		o1.tri(4,'n');
		o1.tri("hello");
}
}
