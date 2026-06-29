package model;

public class Attendance {

private int attendanceId;
private int studentId;
private int sessionId;
private String status;

public Attendance() {
}

public int getAttendanceId() {
return attendanceId;
}

public void setAttendanceId(int attendanceId) {
this.attendanceId = attendanceId;
}

public int getStudentId() {
return studentId;
}

public void setStudentId(int studentId) {
this.studentId = studentId;
}

public int getSessionId() {
return sessionId;
}

public void setSessionId(int sessionId) {
this.sessionId = sessionId;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}
}