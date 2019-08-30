package staticproxy.management;

/**
 * @author Harry
 * @Description //TODO
 * @Date 2019/8/3017:04
 */
public class UserManagerImpl implements UserManager {
    public void addUser(String userId, String userName) {
        System.out.println("工号-"+ userId+userName+"添加成功！！！" );
    }
}
