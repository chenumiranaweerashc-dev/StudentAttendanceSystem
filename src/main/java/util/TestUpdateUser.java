import dao.UserDAO;
import model.User;

public class TestUpdateUser {

public static void main(String[] args) {

User user = new User();

user.setUserId(1); // Change if your user ID is different
user.setUsername("administrator");
user.setPassword("admin456");
user.setRole("Admin");

UserDAO dao = new UserDAO();

if (dao.updateUser(user)) {

System.out.println("User Updated Successfully!");

} else {

System.out.println("Failed to Update User!");
}
}
}