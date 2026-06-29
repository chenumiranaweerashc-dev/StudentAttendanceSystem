import dao.ClassSessionDAO;
import model.ClassSession;

public class TestUpdateClassSession {

public static void main(String[] args) {

ClassSession session = new ClassSession();

session.setSessionId(3); // Change if your session ID is different
session.setSubjectId(2);
session.setLecturerId(3);
session.setClassDate("2026-06-27");
session.setClassTime("10:00:00");

ClassSessionDAO dao = new ClassSessionDAO();

if (dao.updateClassSession(session)) {

System.out.println("Class Session Updated Successfully!");

} else {

System.out.println("Failed to Update Class Session!");
}
}
}