import dao.UserDAO;

public class TestDeleteUser {

public static void main(String[] args) {

UserDAO dao = new UserDAO();

if (dao.deleteUser(1)) { // Use the correct user_id

System.out.println("User Deleted Successfully!");

} else {

System.out.println("Failed to Delete User!");
}
}
}