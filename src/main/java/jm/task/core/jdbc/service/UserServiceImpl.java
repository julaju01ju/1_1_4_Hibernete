package jm.task.core.jdbc.service;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserDaoHibernateImpl getUserDao() {
        return new UserDaoHibernateImpl();
    }
    public void createUsersTable() {
        getUserDao().createUsersTable();

    }

    public void dropUsersTable() {
        getUserDao().dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        getUserDao().saveUser(name, lastName, age);

    }

    public void removeUserById(long id) {
        getUserDao().removeUserById(id);

    }

    public List<User> getAllUsers() {
        return getUserDao().getAllUsers();


    }

    public void cleanUsersTable() {
        getUserDao().cleanUsersTable();

    }
}
