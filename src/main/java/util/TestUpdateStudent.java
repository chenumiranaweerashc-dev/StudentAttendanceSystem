import dao.StudentDAO;
import model.Student;

public class TestUpdateStudent {

public static void main(String[] args) {

Student student = new Student();

student.setStudentId(1); // Change this to an existing student ID
student.setStudentName("Nimal Silva");
student.setEmail("nimalsilva@email.com");
student.setPhone("0712345678");
student.setCourseId(1);

StudentDAO dao = new StudentDAO();

if (dao.updateStudent(student)) {
System.out.println("Student Updated Successfully!");
} else {
System.out.println("Failed to Update Student!");
}
}
}