package model;

public class ClassSession {

private int sessionId;
private int subjectId;
private int lecturerId;
private String classDate;
private String classTime;

public ClassSession() {
}

public int getSessionId() {
return sessionId;
}

public void setSessionId(int sessionId) {
this.sessionId = sessionId;
}

public int getSubjectId() {
return subjectId;
}

public void setSubjectId(int subjectId) {
this.subjectId = subjectId;
}

public int getLecturerId() {
return lecturerId;
}

public void setLecturerId(int lecturerId) {
this.lecturerId = lecturerId;
}

public String getClassDate() {
return classDate;
}

public void setClassDate(String classDate) {
this.classDate = classDate;
}

public String getClassTime() {
return classTime;
}

public void setClassTime(String classTime) {
this.classTime = classTime;
}
}