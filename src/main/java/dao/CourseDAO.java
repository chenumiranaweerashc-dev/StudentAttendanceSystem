
package dao;

import model.Course;
import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseDAO {

public boolean addCourse(Course course) {
// This SQL query MUST only include the columns that actually exist in your MySQL table
String query = "INSERT INTO courses (course_name) VALUES (?)";

try (Connection conn = DBConnection.getConnection();
PreparedStatement stmt = conn.prepareStatement(query)) {

stmt.setString(1, course.getCourseName());

int rowsInserted = stmt.executeUpdate();
return rowsInserted > 0; // Returns true if it successfully added to MySQL

} catch (SQLException e) {
System.out.println("SQL Database Error: " + e.getMessage());
e.printStackTrace();
return false;
}
}
// 1. READ ALL COURSES
public java.util.List<Course> getAllCourses() {
java.util.List<Course> list = new java.util.ArrayList<>();
String query = "SELECT * FROM courses";

try (java.sql.Connection conn = util.DBConnection.getConnection();
java.sql.Statement stmt = conn.createStatement();
java.sql.ResultSet rs = stmt.executeQuery(query)) {

while (rs.next()) {
Course course = new Course();
course.setId(rs.getInt("course_id"));
course.setCourseName(rs.getString("course_name"));
// If you kept duration in your database, uncomment the line below:
// course.setDuration(rs.getString("duration"));
list.add(course);
}
} catch (java.sql.SQLException e) {
System.out.println("Error fetching courses: " + e.getMessage());
}
return list;
}

// 2. UPDATE COURSE
public boolean updateCourse(Course course) {
String query = "UPDATE courses SET course_name = ? WHERE course_id = ?";
try (java.sql.Connection conn = util.DBConnection.getConnection();
java.sql.PreparedStatement stmt = conn.prepareStatement(query)) {

stmt.setString(1, course.getCourseName());
stmt.setInt(2, course.getId());

return stmt.executeUpdate() > 0;
} catch (java.sql.SQLException e) {
System.out.println("Error updating course: " + e.getMessage());
return false;
}
}

// 3. DELETE COURSE
public boolean deleteCourse(int courseId) {
String query = "DELETE FROM courses WHERE course_id = ?";
try (java.sql.Connection conn = util.DBConnection.getConnection();
java.sql.PreparedStatement stmt = conn.prepareStatement(query)) {

stmt.setInt(1, courseId);
return stmt.executeUpdate() > 0;
} catch (java.sql.SQLException e) {
System.out.println("Error deleting course: " + e.getMessage());
return false;
}
}

}