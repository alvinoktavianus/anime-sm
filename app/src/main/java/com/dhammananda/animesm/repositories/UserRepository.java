package com.dhammananda.animesm.repositories;

import com.dhammananda.animesm.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users;
    private static UserRepository instance = null;

    private UserRepository() {
        users = new ArrayList<>();
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
            return instance;
        }
        return instance;
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

    public User save(User user) {
        users.add(user);
        return user;
    }

}
