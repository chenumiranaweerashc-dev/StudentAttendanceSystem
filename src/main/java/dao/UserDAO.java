package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.User;
import util.DBConnection;

public class UserDAO {

public boolean addUser(User user) {

try {

Connection con = DBConnection.getConnection();

String sql = "INSERT INTO users(username, password, role) VALUES (?, ?, ?)";

PreparedStatement pst = con.prepareStatement(sql);

pst.setString(1, user.getUsername());
pst.setString(2, user.getPassword());
pst.setString(3, user.getRole());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public void viewUsers() {

try {

Connection con = DBConnection.getConnection();

String sql = "SELECT * FROM users";

PreparedStatement pst = con.prepareStatement(sql);

var rs = pst.executeQuery();

while (rs.next()) {

System.out.println(
rs.getInt("user_id") + " | " +
rs.getString("username") + " | " +
rs.getString("role")
);
}

} catch (Exception e) {

System.out.println(e.getMessage());
}
}
public boolean updateUser(User user) {

try {

Connection con = DBConnection.getConnection();

String sql = "UPDATE users SET username=?, password=?, role=? WHERE user_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setString(1, user.getUsername());
pst.setString(2, user.getPassword());
pst.setString(3, user.getRole());
pst.setInt(4, user.getUserId());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public boolean deleteUser(int userId) {

try {

Connection con = DBConnection.getConnection();

String sql = "DELETE FROM users WHERE user_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, userId);

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}

}