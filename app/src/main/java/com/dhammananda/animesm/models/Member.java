package com.dhammananda.animesm.models;

import java.time.OffsetDateTime;

public class Member {

    private String fansId;
    private User user;
    private OffsetDateTime joinDate;

    public Member(String fansId) {
        this.fansId = fansId;
    }

    public String getFansId() {
        return fansId;
    }

    public void setFansId(String fansId) {
        this.fansId = fansId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OffsetDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(OffsetDateTime joinDate) {
        this.joinDate = joinDate;
    }

}
