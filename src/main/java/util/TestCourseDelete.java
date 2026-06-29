package util;

import dao.CourseDAO;

public class TestCourseDelete {
public static void main(String[] args) {
CourseDAO dao = new CourseDAO();


int targetIdToDelete = 3;

System.out.println("Attempting to delete Course ID: " + targetIdToDelete);

if (dao.deleteCourse(targetIdToDelete)) {
System.out.println("❌ Course Deleted Successfully from Database!");
} else {
System.out.println("⚠️ Delete Failed! (Make sure the target ID exists in your table)");
}
}
}