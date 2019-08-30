package dynamicproxy.jdkproxy;

import dynamicproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Harry
 * @Description //TODO
 * @Date 2019/8/2915:53
 */
public class DynamicMeipo implements InvocationHandler {

    private Object target;

    /**
     *
     * @param person
     * @return
     */
    public Object getInstance(Person person) {
        //获取到实际需要代理的对象
        this.target = person;
        //通过代理类获取到对应的Class
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
