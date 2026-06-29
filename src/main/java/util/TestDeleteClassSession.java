import dao.ClassSessionDAO;

public class TestDeleteClassSession {

public static void main(String[] args) {

ClassSessionDAO dao = new ClassSessionDAO();

if (dao.deleteClassSession(3)) { // Use your actual session_id

System.out.println("Class Session Deleted Successfully!");

} else {

System.out.println("Failed to Delete Class Session!");
}
}
}
