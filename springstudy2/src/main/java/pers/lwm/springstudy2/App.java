package pers.lwm.springstudy2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring2.5以后开始支持注解，设置compoent-scan以后就可以使用。
 * 
 * spring2.5最高支持1.7版本，高于1.7会使用默认1.4版本，因此在测试时请确认jdk版本和spring版本
 * 
 * @author lwm 2017/04/11
 * 
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		User user = (User) applicationContext.getBean("user");

		System.out.println(user.toString());

	}

}
