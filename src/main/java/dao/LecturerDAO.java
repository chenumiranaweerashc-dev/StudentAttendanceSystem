
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Lecturer;
import util.DBConnection;

public class LecturerDAO {

public boolean addLecturer(Lecturer lecturer) {

try {

Connection con = DBConnection.getConnection();

String sql = "INSERT INTO lecturers(lecturer_name, email) VALUES (?, ?)";

PreparedStatement pst = con.prepareStatement(sql);

pst.setString(1, lecturer.getLecturerName());
pst.setString(2, lecturer.getEmail());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public void viewLecturers() {

try {

Connection con = DBConnection.getConnection();

String sql = "SELECT * FROM lecturers";

PreparedStatement pst = con.prepareStatement(sql);

var rs = pst.executeQuery();

while (rs.next()) {

System.out.println(
rs.getInt("lecturer_id") + " | " +
rs.getString("lecturer_name") + " | " +
rs.getString("email")
);
}

} catch (Exception e) {

System.out.println(e.getMessage());
}
}
public boolean updateLecturer(Lecturer lecturer) {

try {

Connection con = DBConnection.getConnection();

String sql = "UPDATE lecturers SET lecturer_name=?, email=? WHERE lecturer_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setString(1, lecturer.getLecturerName());
pst.setString(2, lecturer.getEmail());
pst.setInt(3, lecturer.getLecturerId());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public boolean deleteLecturer(int lecturerId) {

try {

Connection con = DBConnection.getConnection();

String sql = "DELETE FROM lecturers WHERE lecturer_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, lecturerId);

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}

}
