package staticproxy.management;

/**
 * @author Harry
 * @Description //TODO
 * @Date 2019/8/3017:09
 */
public class UserManagerProxyTest {

    public static void main(String[] args) {
        UserManagerProxy userManagerProxy = new UserManagerProxy(new UserManagerImpl());
        userManagerProxy.addUser("1234","胡艳敏");
    }
}
