package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.pojo.Dog;
import com.demo.pojo.Shiro;
import com.demo.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest//动态加载spring容器
public class DemoApplicationTests {
	//测试为属性赋值
	@Autowired
	private User user;
	@Autowired
	private Dog dog;
	//测试配置类
	@Autowired
	private Shiro shiro;
	
	@Test
	public void testShiro(){
		shiro.pri();
	}
	@Test
	public void contextLoads() {
		System.out.println(user);
	}
	
	@Test
	public void testDog() {
		System.out.println(dog);
	}

}
