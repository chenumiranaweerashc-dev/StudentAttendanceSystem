
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.ClassSession;
import util.DBConnection;

public class ClassSessionDAO {

public boolean addClassSession(ClassSession session) {

try {

Connection con = DBConnection.getConnection();

String sql = "INSERT INTO class_sessions(subject_id, lecturer_id, class_date, class_time) VALUES (?, ?, ?, ?)";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, session.getSubjectId());
pst.setInt(2, session.getLecturerId());
pst.setString(3, session.getClassDate());
pst.setString(4, session.getClassTime());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public void viewClassSessions() {

try {

Connection con = DBConnection.getConnection();

String sql = "SELECT * FROM class_sessions";

PreparedStatement pst = con.prepareStatement(sql);

var rs = pst.executeQuery();

while (rs.next()) {

System.out.println(
rs.getInt("session_id") + " | " +
rs.getInt("subject_id") + " | " +
rs.getInt("lecturer_id") + " | " +
rs.getString("class_date") + " | " +
rs.getString("class_time")
);
}

} catch (Exception e) {

System.out.println(e.getMessage());
}
}
public boolean updateClassSession(ClassSession session) {

try {

Connection con = DBConnection.getConnection();

String sql = "UPDATE class_sessions SET subject_id=?, lecturer_id=?, class_date=?, class_time=? WHERE session_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, session.getSubjectId());
pst.setInt(2, session.getLecturerId());
pst.setString(3, session.getClassDate());
pst.setString(4, session.getClassTime());
pst.setInt(5, session.getSessionId());

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}
public boolean deleteClassSession(int sessionId) {

try {

Connection con = DBConnection.getConnection();

String sql = "DELETE FROM class_sessions WHERE session_id=?";

PreparedStatement pst = con.prepareStatement(sql);

pst.setInt(1, sessionId);

return pst.executeUpdate() > 0;

} catch (Exception e) {

System.out.println(e.getMessage());
return false;
}
}


}
