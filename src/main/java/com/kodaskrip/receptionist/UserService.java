package com.kodaskrip.receptionist;

public interface UserService {

    void create(User user);

    boolean signIn(String username, String password);
}
