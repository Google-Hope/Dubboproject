package com.gxlt.serviceImpl;

import com.gxlt.Interface.UserService;
import com.gxlt.mapper.UserMapper;
import com.gxlt.pojo.User;
import com.gxlt.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> findAllUsers() {
        UserExample userExample = new UserExample();
        List<User> users = mapper.selectByExample(userExample);
        return users;
    }

    @Override
    public void deleUser(String user_id) {
        UserExample userExample = new UserExample();
     userExample.createCriteria().andUseridEqualTo(user_id);
       mapper.deleteByExample(userExample);
    }

    @Override
    public void addUser(User user) {
     mapper.insert(user);
    }

    @Override
    public void changeUser(User user) {

        mapper.updateByPrimaryKey(user);

    }

    @Override
    public User searchUser(String user_id) {
        User user = mapper.selectByPrimaryKey(user_id);
        return user;
    }
}
