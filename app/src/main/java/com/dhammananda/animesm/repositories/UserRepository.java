package com.dhammananda.animesm.repositories;

import com.dhammananda.animesm.models.User;

import java.util.List;

public class UserRepository {

    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    public User findUserByEmailAddress(String emailAddress) {
        for (User user : users) {
            if (user.getEmail().equals(emailAddress)) {
                return user;
            }
        }
        return null;
    }

    public User save(String username, String password, String phoneNumber, String email, String address) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        user.setAddress(address);
        users.add(user);

        return user;
    }

}
