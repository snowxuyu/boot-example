package com.boot.example.api;

import com.boot.example.domain.User;
import com.boot.example.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * date: 2018-1-31 21:36
 * author: snowxuyu
 * describe:
 */
@RestController
@RequestMapping("/api/example")
public class ExampleController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public ResponseEntity<User> hello() {
        logger.debug(">>>>>> hello!");
        User user = new User(1L, "gaoguoxiang", "123456", "18621982087", "上海市");
        ResponseEntity<User> responseEntity = new ResponseEntity<>(user, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping("/insertUser")
    public ResponseEntity<String> insertUser(@RequestBody User user) {
        int insert = userMapper.insert(user);
        ResponseEntity<String> entity = new ResponseEntity<>(insert + "插入成功", HttpStatus.OK);
        return entity;
    }
}
