package util;

import model.Course;
import dao.CourseDAO;

public class TestCourseUpdate {
public static void main(String[] args) {
CourseDAO dao = new CourseDAO();

// Let's modify a course.
// Note: Change the '1' to an ID number that actually exists in your MySQL table!
Course course = new Course();
course.setId(1);
course.setCourseName("BSc (Hons) in Software Engineering");

if (dao.updateCourse(course)) {
System.out.println("✅ Course Updated Successfully!");
} else {
System.out.println("❌ Failed to Update Course!");
}
}
}

