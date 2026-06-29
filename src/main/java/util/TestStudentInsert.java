import dao.StudentDAO;
import model.Student;

public class TestStudentInsert {

public static void main(String[] args) {

Student student = new Student();

student.setStudentName("Kamal Perera");
student.setEmail("kamal@email.com");
student.setPhone("0771234567");
student.setCourseId(1);

StudentDAO dao = new StudentDAO();

if (dao.addStudent(student)) {
System.out.println("Student Added Successfully!");
} else {
System.out.println("Failed to Add Student!");
}
}
}
