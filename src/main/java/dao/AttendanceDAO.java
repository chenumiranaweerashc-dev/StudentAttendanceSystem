package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Attendance;
import util.DBConnection;

public class AttendanceDAO {

public boolean addAttendance(Attendance attendance) {

try {

Connection con = DBConnection.getConnection();

String sql = "INSERT INTO attendance(student_id, session_id, status) VALUES (?, ?, ?)";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, attendance.getStudentId());
pst.setInt(2, attendance.getSessionId());
pst.setString(3, attendance.getStatus());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public void viewAttendance() {

try {

Connection con = DBConnection.getConnection();

String sql = "SELECT * FROM attendance";

PreparedStatement pst = con.prepareStatement(sql);

var rs = pst.executeQuery();

while (rs.next()) {

System.out.println(
rs.getInt("attendance_id") + " | " +
rs.getInt("student_id") + " | " +
rs.getInt("session_id") + " | " +
rs.getString("status")
);
}

} catch (Exception e) {

System.out.println(e.getMessage());
}
}
public boolean updateAttendance(Attendance attendance) {

try {

Connection con = DBConnection.getConnection();

String sql = "UPDATE attendance SET student_id=?, session_id=?, status=? WHERE attendance_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, attendance.getStudentId());
pst.setInt(2, attendance.getSessionId());
pst.setString(3, attendance.getStatus());
pst.setInt(4, attendance.getAttendanceId());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public boolean deleteAttendance(int attendanceId) {

try {

Connection con = DBConnection.getConnection();

String sql = "DELETE FROM attendance WHERE attendance_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, attendanceId);

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}

}
