package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
    //field
    public final int SIZE = 10;
    private Member[] m = new Member[SIZE];
    private int index = 0;

    public int existMemberNum() {
        return index;
    }

    public boolean checkId(String inputId) {
        if (index == 0) {
            return false;
        }

        for (Member member : m) {
            if (member != null) {
                if (member.getId().equals(inputId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int insertMember(String id, String name, String password, String email, char gender, int age) {

        return 0;
    }

    public String searchId(String id) {
        return null;
    }

    public Member[] searchName(String name) {
        return null;
    }

    public Member[] serachEmail(String email) {
        return null;
    }

    public boolean updatePassword(String id, String password) {
        return false;
    }

    public boolean updateName(String id, String name) {
        return false;
    }

    public boolean delete (String id) {
        return false;
    }

    public void delete() {

    }

    public Member[] printAll() {
        return null;
    }
}
