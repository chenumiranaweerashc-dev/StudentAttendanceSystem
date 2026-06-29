
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Student;
import util.DBConnection;

public class StudentDAO {

public boolean addStudent(Student student) {

try {

Connection con = DBConnection.getConnection();

String sql = "INSERT INTO students(student_name,email,phone,course_id) VALUES(?,?,?,?)";

PreparedStatement pst = con.prepareStatement(sql);

pst.setString(1, student.getStudentName());
pst.setString(2, student.getEmail());
pst.setString(3, student.getPhone());
pst.setInt(4, student.getCourseId());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public void viewStudents() {

try {

Connection con = DBConnection.getConnection();

String sql = "SELECT * FROM students";

PreparedStatement pst = con.prepareStatement(sql);

var rs = pst.executeQuery();

while(rs.next()) {

System.out.println(
rs.getInt("student_id") + " | " +
rs.getString("student_name") + " | " +
rs.getString("email")
);
}

} catch(Exception e) {

System.out.println(e.getMessage());
}

}
public boolean updateStudent(Student student) {

try {

Connection con = DBConnection.getConnection();

String sql = "UPDATE students SET student_name=?, email=?, phone=?, course_id=? WHERE student_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setString(1, student.getStudentName());
pst.setString(2, student.getEmail());
pst.setString(3, student.getPhone());
pst.setInt(4, student.getCourseId());
pst.setInt(5, student.getStudentId());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public boolean deleteStudent(int studentId) {

try {

Connection con = DBConnection.getConnection();

String sql = "DELETE FROM students WHERE student_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, studentId);

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}

}