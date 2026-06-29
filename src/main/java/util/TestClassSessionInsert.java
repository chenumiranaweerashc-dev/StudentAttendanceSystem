import dao.ClassSessionDAO;
import model.ClassSession;

public class TestClassSessionInsert {

public static void main(String[] args) {

ClassSession session = new ClassSession();

session.setSubjectId(2);
session.setLecturerId(3);
session.setClassDate("2026-06-26");
session.setClassTime("09:00:00");

ClassSessionDAO dao = new ClassSessionDAO();

if (dao.addClassSession(session)) {

System.out.println("Class Session Added Successfully!");

} else {

System.out.println("Failed to Add Class Session!");
}
}
}