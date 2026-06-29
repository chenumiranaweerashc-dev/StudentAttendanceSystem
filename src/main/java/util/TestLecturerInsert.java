import dao.LecturerDAO;
import model.Lecturer;

public class TestLecturerInsert {

public static void main(String[] args) {

Lecturer lecturer = new Lecturer();

lecturer.setLecturerName("Dr. Silva");
lecturer.setEmail("silva@email.com");

LecturerDAO dao = new LecturerDAO();

if (dao.addLecturer(lecturer)) {

System.out.println("Lecturer Added Successfully!");

} else {

System.out.println("Failed to Add Lecturer!");
}
}
}