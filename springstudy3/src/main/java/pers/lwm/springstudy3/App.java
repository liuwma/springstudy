package pers.lwm.springstudy3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring 提供了xml配置  及java配置
 * 
 * 使用java配置 要求spring4.1以上版本
 * 
 * @author lwm 2017/04/11
 * 
 */
public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		User user = (User) applicationContext.getBean("user");

		System.out.println(user.toString());

	}

}
