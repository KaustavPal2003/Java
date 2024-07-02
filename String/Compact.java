import java.io.*;
import java.util.*;
class str
{
	private String s;
	public str()
	{
		s="";
	}
	public str(String t)
	{
		s=t;
	}
	public void read()
	{
		try
		{
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter string : ");
			s=d.readLine();
		}
		catch(IOException e)
		{
			System.out.println("input error");
		}
	}
	public void rev()
	{
		String r="";
		String x;
		for(int i=0;i<s.length();i++)
		{
			x=s.substring(i,i+1);
			r=x+r;
		}
		System.out.println("reverse => "+r);
		if(r.equals(s)==true)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
	public void substr()
	{
		try
		{
			int c=0;
			String w,e;
			s=s.toLowerCase();
			System.out.println("Enter the substring");
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			w=d.readLine();
			w=w.toLowerCase();
			int n=s.length()-w.length()+1;
			for(int i=0;i<n;i++)
			{
				e=s.substring(i,i+w.length());
				if(w.equals(e)==true)
					c++;
			}
			System.out.println("Count=>"+c);
		}
		catch(IOException e)
		{
			System.out.println("Input error");
		}
	}
	public void frq()
	{
		s=s.toLowerCase();
		for(int i=97;i<=122;i++)
		{
			char d=(char)i;
			int c=0;
			for(int j=0;j<s.length();j++)
				if(s.charAt(j)==d)
					c++;
			if(c!=0)
				System.out.println(d+"  "+c);	
		}
	}
	public void sort()
	{
	String[] x=s.split(",");
	for(int i=0;i<x.length-1;i++){
		for(int j=0;j<x.length-1-i;j++){
			if(x[j].compareTo(x[j+1])>0)
			{
				String t=x[j];
				x[j]=x[j+1];
				x[j+1]=t;
			}
	}
	}
			for(int i=0;i<x.length;i++)
		System.out.println(x[i]);
}
	public void frq_given_word()
	{
		try
		{
			int c=0;
			String e,f,w;
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Find what?");
			w=d.readLine();
			w=w.toLowerCase();
			s=s.toLowerCase();
			StringTokenizer t=new StringTokenizer(s);
			int c1=t.countTokens();
			while(t.hasMoreTokens()==true)
			{
				f=t.nextToken();
				if(f.equals(w)==true)
					c++;
			}
				System.out.println("freq. of words :"+c+"/"+c1);
			}		
		catch(IOException e)
		{
			System.out.println("input error");
		}
	}
	public void freq_of_each_word()
	{
		s=s.toLowerCase();
		String[] x=s.split(" ");
		int n=x.length;
		int[] c=new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=1;
			for(int k=0;k<i;k++)
				if(x[k].equals(x[i])==true)
				{
					c[k]++;
					c[i]=-1;
					break;
				}	
		}
		for(int i=0;i<n;i++)
			if(c[i]!=-1)
				System.out.println(x[i]+" "+c[i]);
	}
	public void dtob()
	{
		int n=Integer.parseInt(s);
		String b="";
		while(n>0)
		{
			int d=n%2;
			b=d+b;
			n=n/2;
		}
		System.out.println("binary :"+b);
	}
	public void btod()
	{
		int n=s.length();
		int p=n-1;
		int d=0;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='1')
			d+=(int)Math.pow(2,p);
			p--;
		}
		System.out.println("decimal :"+d);
	}
	public static void main (String[] args) {
		str u=new str();
		u.read();
		u.freq_of_each_word();
    /*
		u.substr();
		u.sort();
		u.rev();
		u.frq();
		u.frq_given_word();
		u.freq_of_each_word();
		u.dtob();
		u.btod();
		*/
}
}
