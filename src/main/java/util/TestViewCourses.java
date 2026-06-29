package util;

import dao.CourseDAO;
import model.Course;
import java.util.List;

public class TestViewCourses {
public static void main(String[] args) {
CourseDAO dao = new CourseDAO();

System.out.println("====== RETRIEVING ALL COURSES ======");
List<Course> courseList = dao.getAllCourses();

if (courseList.isEmpty()) {
System.out.println("No courses found in the database table.");
} else {
for (Course course : courseList) {
// If your primary key column is course_id, it will print accurately here
System.out.println("Course ID: " + course.getId() + " | Name: " + course.getCourseName());
}
}
System.out.println("=====================================");
}
}
