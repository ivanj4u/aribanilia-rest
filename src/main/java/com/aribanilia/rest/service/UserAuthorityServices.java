package com.aribanilia.rest.service;

import com.aribanilia.rest.dao.UserAuthorityDao;
import com.aribanilia.rest.entity.UserAuthority;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ivan_j4u on 5/30/2017.
 */
@Service
public class UserAuthorityServices {

    @Autowired private UserAuthorityDao dao;

    private static final Logger logger = LoggerFactory.getLogger(UserAuthorityServices.class);

    public void save(UserAuthority o) {
        logger.info("Saving USER_AUTHORITY : " + o.getUserId() + " - " + o.getAuthorityId());
        dao.save(o);
    }

    public List<UserAuthority> getAll() {
        List<UserAuthority> list = dao.findAll();
        logger.info("Data found : " + list.size());
        return list;
    }

    public List<UserAuthority> getByUserId(String userId) {
        List<UserAuthority> list = dao.findByUserId(userId);
        logger.info("Data found : " + list.size());
        return list;
    }

    public List<UserAuthority> getByAuthorityId(String authorityId) {
        List<UserAuthority> list = dao.findByAuthorityId(authorityId);
        logger.info("Data found : " + list.size());
        return list;
    }
}
