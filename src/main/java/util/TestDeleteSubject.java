import dao.SubjectDAO;

public class TestDeleteSubject {

public static void main(String[] args) {

SubjectDAO dao = new SubjectDAO();

if (dao.deleteSubject(1)) {

System.out.println("Subject Deleted Successfully!");

} else {

System.out.println("Failed to Delete Subject!");
}
}
}