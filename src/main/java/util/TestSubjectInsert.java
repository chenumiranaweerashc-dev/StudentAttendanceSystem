import dao.SubjectDAO;
import model.Subject;

public class TestSubjectInsert {

public static void main(String[] args) {

Subject subject = new Subject();

subject.setSubjectName("Database Systems");
subject.setCourseId(1);

SubjectDAO dao = new SubjectDAO();

if (dao.addSubject(subject)) {

System.out.println("Subject Added Successfully!");

} else {

System.out.println("Failed to Add Subject!");
}
}
}
