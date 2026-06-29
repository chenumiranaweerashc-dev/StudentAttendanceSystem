package model;

public class Subject {

private int subjectId;
private String subjectName;
private int courseId;

public Subject() {
}

public int getSubjectId() {
return subjectId;
}

public void setSubjectId(int subjectId) {
this.subjectId = subjectId;
}

public String getSubjectName() {
return subjectName;
}

public void setSubjectName(String subjectName) {
this.subjectName = subjectName;
}

public int getCourseId() {
return courseId;
}

public void setCourseId(int courseId) {
this.courseId = courseId;
}
}
