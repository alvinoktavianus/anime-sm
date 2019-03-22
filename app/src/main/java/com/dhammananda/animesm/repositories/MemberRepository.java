package com.dhammananda.animesm.repositories;

import com.dhammananda.animesm.models.Member;

import java.util.List;

public class MemberRepository {

    private List<Member> members;

    public MemberRepository(List<Member> members) {
        this.members = members;
    }

    public List<Member> findAll() {
        return members;
    }

}
