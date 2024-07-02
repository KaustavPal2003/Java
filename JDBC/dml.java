package db;
import java.sql.*;
import java.util.*;
public class dml{
	public static Connection get_con(){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			/* MYSQL
			 Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");*/
		}
		catch(Exception e){
			System.out.println("Connection error "+e.getMessage());
		}
		return con;
	}
	public int ins(String id,String s1,String s2){
	int v=0;
	try{
		Connection c=get_con();
		PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?)");
		ps.setString(1,id);
		ps.setString(2,s1);
		ps.setString(3,s2);
		v=ps.executeUpdate();
	}
	catch(Exception e1){
		System.out.println("insert error");
	}
	return v;
}
public int del(String id){
	int v=0;
	try{
		Connection c=get_con();
		PreparedStatement ps=c.prepareStatement("delete from student where id=(?)");
		ps.setString(1,id);
		v=ps.executeUpdate();
	}
	catch(Exception e1){
		System.out.println("deletion error");
	}
	return v;
}
public int up(String id,String s1,String s2){
	int v=0;
	try{
		Connection c=get_con();
			PreparedStatement ps=c.prepareStatement("update student set name=(?),mob=(?) where id=(?)");
			ps.setString(1,s1);
			ps.setString(2,s2);
			ps.setString(3,id);
			v=ps.executeUpdate();
	}
	catch(Exception e1){
		System.out.println("updation error");
	}
	return v;
}
public ArrayList find(String id){
	ArrayList ar=new ArrayList();
	try{
		Connection c=get_con();
			PreparedStatement ps=c.prepareStatement("select id,name,mob from student where id=(?)");
			ps.setString(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				ar.add(rs.getString(1));
				ar.add(rs.getString(2));
				ar.add(rs.getString(3));
			}
			
	}
	catch(Exception e1){
		System.out.println("find error"+e1.getMessage());
	}
	return ar;
}
public ArrayList list(){
	ArrayList ar=new ArrayList();

	try{
			
			Connection c=get_con();
			PreparedStatement ps=c.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				ar.add(rs.getString(1));
				ar.add(rs.getString(2));
				ar.add(rs.getString(3));
			}
	}
	catch(Exception e1){
		System.out.println("find error"+e1.getMessage());
	}
	return ar;
}
public boolean fx_login(String s,String c1){
	try{
		Connection c=get_con();
		PreparedStatement ps=c.prepareStatement("select * from signin where LOGIN=? and PASSWORD=?");
		ps.setString(1,s);
		ps.setString(2,c1);
		ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
			    return true;
			}
	}
	catch(Exception e1){
		System.out.println("login error");
	}
	return false;
}
public static void main (String[] args) {
	dml k=new dml();
	System.out.println (k.fx_login("ram","456"));
}
}
