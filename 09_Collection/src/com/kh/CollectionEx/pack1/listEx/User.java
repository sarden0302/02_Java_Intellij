package com.kh.CollectionEx.pack1.listEx;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private String email;

    //method

    @Override
    public String toString() {
        return  username + " " + password + " " + email;
    }
}
