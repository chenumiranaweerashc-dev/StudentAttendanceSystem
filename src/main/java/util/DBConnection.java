package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

public static Connection getConnection() {

try {

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/sams_db",
"root",
"Clrlaki@2006"
);

return con;

} catch (Exception e) {

System.out.println(e.getMessage());
return null;
}
}
}