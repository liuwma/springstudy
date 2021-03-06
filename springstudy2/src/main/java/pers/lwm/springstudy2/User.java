package pers.lwm.springstudy2;

import org.springframework.stereotype.Component;

/**
 * 用户类
 * 
 * @author lwm 2017/04/11
 *
 */

@Component
public class User {

	private int id;
	private String name;
	private int age;

	// 默认构造函数
	public User() {

	}

	// 带参数的构造函数
	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ";name=" + name + ";age=" + age + ";";
	}
}
