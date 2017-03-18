import java.sql.*;

class JDBCDemo {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            // create table if not exists
            PreparedStatement statement = conn.prepareStatement("create table if not exists user(id int primary key auto_increment, name varchar(50), email varchar(100))");
            statement.execute();
            // insert
            statement = conn.prepareStatement("insert into user  (name, email) values (?,?)");
            statement.setString(1, "smit");
            statement.setString(2, "smitthakkar96@gmail.com");
            statement.executeUpdate();
            System.out.println("Connected");
            // select
            statement = conn.prepareStatement("select * from user");
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                System.out.println(result.getString("name"));
            }
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }

    }
}