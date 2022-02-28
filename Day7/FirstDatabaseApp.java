import java.sql.* ;
public class FirstDatabaseApp
{
public FirstDatabaseApp()
{
try
{
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");

Statement stmt = con.createStatement() ;
String queryString = new String("select * from departments;");
//String queryString = new String(" INSERT INTO departments values('DEPT IT',100,112233,'2006-11-01')");
//String queryString = new String("delete from employee where SSN=7738467");
//int rs = stmt.executeUpdate(queryString) ;

ResultSet rs = stmt.executeQuery(queryString) ;



while(rs.next())
{
System.out.println(rs.getString(1));

System.out.println(rs.getInt(2));

System.out.println(rs.getInt(3));
}

stmt.close();
con.close();

}
catch(SQLException ex)
{
ex.printStackTrace();
}
}
public static void main(String[] args)
{
new FirstDatabaseApp();
}
}