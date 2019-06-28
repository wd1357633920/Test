package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.pojo.Shiro;

//该类中(标识!!)就是xml中数据 <bean id="方法名" class="shiro">
@Configuration
public class ShiroConfig {
	@Bean
	public Shiro shiro() {
		return new Shiro();
	}
}
