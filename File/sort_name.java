import java.io.*;
import java.util.*;

class f1
{
	private String s;
	private String[] a;
	public void write()
	{
		try
		{
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			FileWriter f=new FileWriter("xy.txt");
			BufferedWriter wr=new BufferedWriter(f);
			while(true)
			{
				System.out.println("Enter String : ");
				s=d.readLine();
				s=s.toLowerCase();
				if(s.equals("end"))
					break;
				wr.write(s);
				wr.write("\n");
				}
			wr.close();
		}
		catch(IOException e1)
		{
		}
	}
	public void read() throws IOException
	{
		FileReader fr=new FileReader("xy.txt");
		BufferedReader br=new BufferedReader(fr);
		String k="";
		while((k=br.readLine())==null)
			System.out.println(k);
		br.close();
	}
	public void name_word() throws IOException
	{
		FileReader fr=new FileReader("xy.txt");
		BufferedReader br=new BufferedReader(fr);
		String k,b="";
		a=new String[20];
		int n=0;
		while((k=br.readLine())!=null)
		{
			a[n]=k;
			n++;
		}
		for (int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-i-1; j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
				}
			}
	}
	for (int i = 0; i<n; i++)
		System.out.println(a[i]);
	br.close();
	try
	{
	FileWriter f=new FileWriter("cd.txt");
	BufferedWriter wr=new BufferedWriter(f);
	for (int i = 0; i<n; i++)
	{
		wr.write(a[i]);
		wr.write("\n");
	}
	wr.close();
	}
	catch(IOException e1)
		{
		}
	}
	public static void main (String[] args) throws IOException{
		f1 k=new f1();
		k.write();
		k.read();
		k.name_word();
}
}
