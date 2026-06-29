import dao.StudentDAO;

public class TestDeleteStudent {

public static void main(String[] args) {

StudentDAO dao = new StudentDAO();

if (dao.deleteStudent(2)) {

System.out.println("Student Deleted Successfully!");

} else {

System.out.println("Failed to Delete Student!");
}
}
}
