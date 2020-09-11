package dao;

import model.User;

interface UserDaoInterface{

    int signUp(User user) throws Exception;
    boolean loginUser(User user) throws Exception;

}

