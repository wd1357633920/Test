package com.demo.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/*
 * 为对象的属性赋值
 * 将对象交给spring容器管理
 * */
@Component //Map<k,v> key为user  value 为user对象
@ConfigurationProperties(prefix = "user")
public class User implements Serializable{
	private static final long serialVersionUID = 2318999490220459398L;
	private Integer id;
	private Integer age;
	private String userName;
	
	/*
	 * @Value("${user.id}")//从容器中取值并赋值 private Integer id;
	 * 
	 * @Value("${user.userName}")//从容器中取值并赋值 private String userName;
	 * 
	 * @Value("${user.age}")//从容器中取值并赋值 private Integer age;
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}
	
}
