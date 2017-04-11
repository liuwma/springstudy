package pers.lwm.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring 入门学习
 * 
 * spring 借助java反射、动态代理、单例模式、原型模式等 实现了类加载器与类管理容器
 * 
 * @author lwm 2017/04/11
 * 
 */
public class App {
	
	public static void main(String[] args) {

		System.out.println("Hello World!");

		// 属性注入
		testProperty();

		// 构造函数注入
		testConstructor();

		// 测试是否相等 scope 单例模式与原型模式
		testEquals();
	}

	public static void testProperty() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		User user = (User) applicationContext.getBean("user");

		System.out.println(user.toString());
	}

	public static void testConstructor() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		User user = (User) applicationContext.getBean("user2");

		System.out.println(user.toString());
	}

	public static void testEquals() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		// 默认scope 是 singleton 单例模式 (非线程安全)
		User user = (User) applicationContext.getBean("user");
		User user_other = (User) applicationContext.getBean("user");
		System.out.println("user = user_other " + (user == user_other));

		// 修改scope 为 prototype 每次获取时创建新对像 (线程安全)
		User user3 = (User) applicationContext.getBean("user3");
		User user3_other = (User) applicationContext.getBean("user3");
		System.out.println("user3 = user3_other " + (user3 == user3_other));

	}
}
