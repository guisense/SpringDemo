package com.example.demo.webController;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class userController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<User> getAllUser(){
        return userMapper.findAllUser();
    }
}
