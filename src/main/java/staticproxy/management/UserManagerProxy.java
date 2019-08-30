package staticproxy.management;

/**
 * @author Harry
 * @Description //TODO
 * @Date 2019/8/3017:05
 */
public class UserManagerProxy implements UserManager {


    private UserManager userManager;

    public UserManagerProxy(UserManager userManager) {
        this.userManager = userManager;
    }

    public void addUser(String userId, String userName) {
        userManager.addUser(userId, userName);
    }
}
