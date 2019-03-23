package com.dhammananda.animesm.repositories;

import com.dhammananda.animesm.models.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private List<Member> members;
    private static MemberRepository instance = null;

    private MemberRepository() {
        members = new ArrayList<>();
    }

    public static MemberRepository getInstance() {
        if (instance == null) {
            instance = new MemberRepository();
            return instance;
        }
        return instance;
    }

    public List<Member> findAll() {
        return members;
    }

}
