package javadatabase;
import java.sql.*;
public class java {
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/abc";
		String uname = "";
		String pass  ="";
		String query = "SELECT* FROM student_table";
		
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		rs.next();
		String name = rs.getString("abc");
		
		System.out.println(name);
		st.close();
		con.close();
		
		
		
	}
	}

}
