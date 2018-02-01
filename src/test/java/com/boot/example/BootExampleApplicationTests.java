package com.boot.example;

import com.boot.example.domain.User;
import com.boot.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootExampleApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	@Transactional
	public void findByName() throws Exception {
		User user = new User(1L, "高国祥", "12345", "18621982087", "上海市杨浦区");
		userMapper.insert(user);
		User u = userMapper.findByName("高国祥");
		System.out.println(u);
	}

}
