package com.aribanilia.rest.service;

import com.aribanilia.rest.dao.AuthorityDao;
import com.aribanilia.rest.entity.Authority;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ivan_j4u on 5/30/2017.
 */
@Service
public class AuthorityServices {

    @Autowired private AuthorityDao dao;

    private static final Logger logger = LoggerFactory.getLogger(AuthorityServices.class);

    public void save(Authority o) {
        logger.info("Saving AUTHORITY : " + o.getAuthorityId());
        dao.save(o);
    }

    public List<Authority> getAll() {
        List<Authority> list = dao.findAll();
        logger.info("Data found : " + list.size());
        return list;
    }

    public Authority getByAuthorityId(String authorityId) {
        Authority auth = dao.findByAuthorityId(authorityId);
        if (auth != null)
            logger.info("Data found : " + auth.getId() + " - " + auth.getDescription());
        else
            logger.info("Data not found : " + authorityId);
        return dao.findByAuthorityId(authorityId);
    }
}
