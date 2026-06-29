package model;

public class Course {
private int id;
private String courseName;

// Default Constructor
public Course() {
}

// Constructor with parameters
public Course(int id, String courseName) {
this.id = id;
this.courseName = courseName;
}

// GETTER for ID
public int getId() {
return id;
}

// SETTER for ID (This is what CourseDAO is missing!)
public void setId(int id) {
this.id = id;
}

// GETTER for Course Name
public String getCourseName() {
return courseName;
}

// SETTER for Course Name
public void setCourseName(String courseName) {
this.courseName = courseName;
}
}