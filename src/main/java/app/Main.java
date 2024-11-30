package app;


import app.user.UserRepository;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.findUserById(1);
        userRepository.findUserByEmail("olexiy@gmail.com");
        userRepository.findAllUsers();
    }
}