package util; 

import dao.CourseDAO;
import model.Course;

public class TestCourseInsert {

public static void main(String[] args) {

Course course = new Course();

course.setCourseName("Higher Diploma in Computing");



CourseDAO dao = new CourseDAO();

if (dao.addCourse(course)) {
System.out.println("Course Added Successfully!");
} else {
System.out.println("Failed to Add Course!");
}
}
}
