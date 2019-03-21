package com.dhammananda.animesm.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private String userId;
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
    private String address;

}
