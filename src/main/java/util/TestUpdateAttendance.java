import dao.AttendanceDAO;
import model.Attendance;

public class TestUpdateAttendance {

public static void main(String[] args) {

Attendance attendance = new Attendance();

attendance.setAttendanceId(1);
attendance.setStudentId(1);
attendance.setSessionId(4);
attendance.setStatus("Late");

AttendanceDAO dao = new AttendanceDAO();

if (dao.updateAttendance(attendance)) {

System.out.println("Attendance Updated Successfully!");

} else {

System.out.println("Failed to Update Attendance!");
}
}
}