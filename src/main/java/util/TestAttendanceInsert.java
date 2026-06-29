import dao.AttendanceDAO;
import model.Attendance;

public class TestAttendanceInsert {

public static void main(String[] args) {

Attendance attendance = new Attendance();

attendance.setStudentId(1);
attendance.setSessionId(4);
attendance.setStatus("Present");

AttendanceDAO dao = new AttendanceDAO();

if (dao.addAttendance(attendance)) {

System.out.println("Attendance Added Successfully!");

} else {

System.out.println("Failed to Add Attendance!");
}
}
}
