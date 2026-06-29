import dao.LecturerDAO;
import model.Lecturer;

public class TestUpdateLecturer {

public static void main(String[] args) {

Lecturer lecturer = new Lecturer();

lecturer.setLecturerId(1); // Change if needed
lecturer.setLecturerName("Prof. Silva");
lecturer.setEmail("prof.silva@email.com");

LecturerDAO dao = new LecturerDAO();

if (dao.updateLecturer(lecturer)) {

System.out.println("Lecturer Updated Successfully!");

} else {

System.out.println("Failed to Update Lecturer!");
}
}
}
