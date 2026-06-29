
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Subject;
import util.DBConnection;

public class SubjectDAO {

public boolean addSubject(Subject subject) {

try {

Connection con = DBConnection.getConnection();

String sql = "INSERT INTO subjects(subject_name, course_id) VALUES (?, ?)";

PreparedStatement pst = con.prepareStatement(sql);

pst.setString(1, subject.getSubjectName());
pst.setInt(2, subject.getCourseId());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public void viewSubjects() {

try {

Connection con = DBConnection.getConnection();

String sql = "SELECT * FROM subjects";

PreparedStatement pst = con.prepareStatement(sql);

var rs = pst.executeQuery();

while (rs.next()) {

System.out.println(
rs.getInt("subject_id") + " | " +
rs.getString("subject_name") + " | " +
rs.getInt("course_id")
);
}

} catch (Exception e) {

System.out.println(e.getMessage());
}
}
public boolean updateSubject(Subject subject) {

try {

Connection con = DBConnection.getConnection();

String sql = "UPDATE subjects SET subject_name=?, course_id=? WHERE subject_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setString(1, subject.getSubjectName());
pst.setInt(2, subject.getCourseId());
pst.setInt(3, subject.getSubjectId());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public boolean deleteSubject(int subjectId) {

try {

Connection con = DBConnection.getConnection();

String sql = "DELETE FROM subjects WHERE subject_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, subjectId);

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
}