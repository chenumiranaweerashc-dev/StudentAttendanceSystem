import dao.AttendanceDAO;

public class TestDeleteAttendance {

public static void main(String[] args) {

AttendanceDAO dao = new AttendanceDAO();

if (dao.deleteAttendance(1)) {

System.out.println("Attendance Deleted Successfully!");

} else {

System.out.println("Failed to Delete Attendance!");
}
}
}
