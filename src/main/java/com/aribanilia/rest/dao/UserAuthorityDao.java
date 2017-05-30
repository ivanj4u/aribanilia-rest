package com.aribanilia.rest.dao;

import com.aribanilia.rest.entity.UserAuthority;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by ivan_j4u on 5/30/2017.
 */
public interface UserAuthorityDao extends MongoRepository<UserAuthority, String> {

    List<UserAuthority> findByUserId(String userId);

    List<UserAuthority> findByAuthorityId(String authorityId);

}
