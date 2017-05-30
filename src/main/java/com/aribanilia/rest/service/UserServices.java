package com.aribanilia.rest.service;

import com.aribanilia.rest.dao.UserDao;
import com.aribanilia.rest.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ivan_j4u on 5/30/2017.
 */
@Service
public class UserServices {

    @Autowired private UserDao dao;

    private static final Logger logger = LoggerFactory.getLogger(UserServices.class);

    public void save(User o) {
        logger.info("Saving USER : " + o.getUserId() + " - " + o.getName());
        dao.save(o);
    }

    public List<User> getAll() {
        List<User> list = dao.findAll();
        logger.info("Data found : " + list.size());
        return list;
    }

    public User getByUserId(String userId) {
        User user = dao.findByUserId(userId);
        if (user != null)
            logger.info("Data found : " + user.getUserId() + " - " + user.getName());
        else
            logger.info("Data not found : " + userId);
        return user;
    }

    public User login(String userId, String password) {
        User user = dao.findByUserIdAndPassword(userId, password);
        if (user != null)
            logger.info("Data found : " + user.getUserId() + " - " + user.getName());
        else
            logger.info("Data not found : " + userId);
        return user;
    }
}
