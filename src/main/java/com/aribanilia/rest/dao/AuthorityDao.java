package com.aribanilia.rest.dao;

import com.aribanilia.rest.entity.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ivan_j4u on 5/30/2017.
 */
public interface AuthorityDao extends MongoRepository<Authority, String> {

    Authority findByAuthorityId(String authorityId);

}
