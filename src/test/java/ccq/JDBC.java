package ccq;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
 
 
public class JDBC {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        String sql;
        String url = "jdbc:mysql://localhost:3306/test?"
                + "user=root&password=root&useUnicode=true&characterEncoding=UTF8"; // 2提供JDBC连接的URL 
        try {
            Class.forName("com.mysql.jdbc.Driver");			                    // 1加载JDBC的驱动程序
            System.out.println("成功加载MySQL驱动程序");
            conn = DriverManager.getConnection(url);       						// 3创建数据库的连接
            // Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等
            Statement stmt = conn.createStatement();       						//4创建一个Statement 
            sql = "select * from stu_tab";
            ResultSet result = stmt.executeQuery(sql);      					//5执行SQL语句
            while(result.next()){												//6处理结果
            	System.out.println("返回的结果1："+result.getString("stu_name"));
            	System.out.println("返回的结果2："+result.getString("stu_age"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();														//关闭JDBC对象
        }
 
    }
 
}
