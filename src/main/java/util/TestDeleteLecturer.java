import dao.LecturerDAO;

public class TestDeleteLecturer {

public static void main(String[] args) {

LecturerDAO dao = new LecturerDAO();

if (dao.deleteLecturer(2)) {

System.out.println("Lecturer Deleted Successfully!");

} else {

System.out.println("Failed to Delete Lecturer!");
}
}
}