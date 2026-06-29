import dao.UserDAO;
import model.User;

public class TestUserInsert {

public static void main(String[] args) {

User user = new User();

user.setUsername("admin");
user.setPassword("admin123");
user.setRole("Admin");

UserDAO dao = new UserDAO();

if (dao.addUser(user)) {

System.out.println("User Added Successfully!");

} else {

System.out.println("Failed to Add User!");
}
}
}
