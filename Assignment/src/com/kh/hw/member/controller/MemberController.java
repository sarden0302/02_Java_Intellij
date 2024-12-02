package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class MemberController {
    //field
    public final int SIZE = 10;
    private Member[] m = new Member[SIZE];
    private int count = 0;

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
        if (count >= SIZE) {
            return "최대 등록 가능한 회원 수는 10명입니다.\n현재 등록된 회원 수는 " + count + "명입니다.\n회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.\n";
        }

        m[count] = new Member(id, name, password, email, gender, age);
        count++;
        return "";
    }

    public String searchId(String id) {
        if (m[0] == null) {
            return "현재 명단은 비어있습니다.";
        }

        for (Member member : m) {
            if (member.getId().equals(id)) {
                return "찾으신 회원 정보 : " + member.toString();
            }
        }
        return "찾으시는 회원은 명단에 없습니다.";

    }

    public boolean searchName(String name) {
        if (m[0] == null) {
            System.out.println("현재 명단은 비어있습니다.");
            return false;
        }

        for (Member member : m) {
            if (member.getName().equals(name)) {
                System.out.println("찾으신 회원 정보 : " + member.toString());
                return true;
            }
        }
        System.out.println("찾으시는 회원은 명단에 없습니다.");
        return false;
    }

    public boolean searchEmail(String email) {
        if (m[0] == null) {
            System.out.println("현재 명단은 비어있습니다.");
            return false;
        }

        for (Member member : m) {
            if (member.getEmail().equals(email)) {
                System.out.println("찾으신 회원 정보 : " + member.toString());
                return true;
            }
        }
        System.out.println("찾으시는 회원은 명단에 없습니다.");
        return false;
    }

    public boolean updatePassword(String id, String password) {
        if (m.length == 0) {
            return false;
        }

        for (Member member : m) {
            if (member.getId().equals(id)) {
                member.setPassword(password);
                return true;
            }
        }
        return false;
    }

    public boolean updateName(String id, String name) {
        if (m.length == 0) {
            return false;
        }

        for (Member member : m) {
            if (member.getId().equals(id)) {
                member.setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String id, String email) {
        if (m.length == 0) {
            return false;
        }

        for (Member member : m) {
            if (member.getId().equals(id)) {
                member.setEmail(email);
                return true;
            }
        }
        return false;
    }

    public boolean delete (String id) {
        if (count == 0) {
            return false;
        }

        // 1. ArrayList로 변경 후 재설정 후 다시 입력
        // 2. System.arraycopy()
        boolean checking = false;

        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {

                break;
            }
            System.out.println("delete 내 m[" + i + "] : " + m[i].inform());
            if (m[i].getId().equals(id)) {
                m[i] = null;
                checking = true;
            }
        }
        List<Member> memberArrayList = Arrays.asList(m);

        if (!checking) {
            return false;
        }

        m = new Member[SIZE];

        for (int i = 0; i < memberArrayList.size(); i++) {
            m[i] = memberArrayList.get(i);
        }
        count--;
        return true;
    }

    public void delete() {
        m = new Member[SIZE];
        count = 0;
    }

    public void printAll() {
        for (Member member : m) {
            if (member == null) {
                return;
            }
            System.out.println(member.inform());
        }
    }


}
