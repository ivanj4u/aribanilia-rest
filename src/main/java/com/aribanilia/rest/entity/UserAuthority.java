package com.aribanilia.rest.entity;

/**
 * Created by ivan_j4u on 5/30/2017.
 */
public class UserAuthority {

    private String id;
    private String userId;
    private String authorityId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId;
    }
}
