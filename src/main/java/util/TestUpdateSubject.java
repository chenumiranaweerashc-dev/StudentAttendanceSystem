import dao.SubjectDAO;
import model.Subject;

public class TestUpdateSubject {

public static void main(String[] args) {

Subject subject = new Subject();

subject.setSubjectId(1); // Change if needed
subject.setSubjectName("Advanced Database Systems");
subject.setCourseId(1);

SubjectDAO dao = new SubjectDAO();

if (dao.updateSubject(subject)) {

System.out.println("Subject Updated Successfully!");

} else {

System.out.println("Failed to Update Subject!");
}
}
}