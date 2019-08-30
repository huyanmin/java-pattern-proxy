package dynamicproxy.jdkproxy;

import dynamicproxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Harry
 * @Description //TODO
 * @Date 2019/8/2916:01
 */
public class DynamicProxyTest {

    public static void main(String[] args) throws IOException {
        Person person = (Person) new DynamicMeipo().getInstance(new Girl());
        person.findLove();
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy.class", new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("E://$Proxy.class");
        os.write(bytes);
        os.close();
    }
}
