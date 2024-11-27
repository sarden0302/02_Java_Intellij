package com.kh.CollectionEx.pack2.setEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class 회원 {
    private int id;
    private String name;
    private String email;
    private String hobby;

    @Override
    public String toString() {
        return "회원{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
