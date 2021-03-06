package pers.lwm.springstudy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * java 反射使用
 * 
 * @author lwm 2017/04/11
 *
 */
public class ReflectDemo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		try {

			// 动态生成类
			Class<?> c = Class.forName("pers.lwm.springstudy.User");
			User user = (User) c.newInstance();

			System.out.println(user.toString());

			// 调用方法
			Method method = c.getMethod("toString", null);
			Object result = method.invoke(user, null);

			System.out.println(result);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
