package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class MemberController {
    //field
    public final int SIZE = 10;
    private Member[] m = new Member[SIZE];


    public int existMemberNum() {
        return m.length;
    }

    public boolean checkId(String inputId) {
        if (m.length == 0) {
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

    public String insertMember(String id, String name, String password, String email, char gender, int age) {
        if (m.length > SIZE) {
            return "최대 등록 가능한 회원 수는 10명입니다.\n현재 등록된 회원 수는 10명입니다.\n회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.\n";
        }

        m[m.length + 1] = new Member(id, name, password, email, gender, age);
        return "새 회원을 등록합니다.";
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
