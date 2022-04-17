package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Rosy", "Peters", (byte) 45);
        userService.saveUser("Annie", "Gibson", (byte) 35);
        userService.saveUser("Jenny", "Grant", (byte) 25);
        userService.saveUser("Barbie", "Davis", (byte) 15);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
