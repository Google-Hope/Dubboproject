package com.gxlt.Interface;

import com.gxlt.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUsers();

    public  void  deleUser(String user_id);

    public  void  addUser(User user);

    public  void  changeUser(User user);

    public  User searchUser(String user_id);
}
