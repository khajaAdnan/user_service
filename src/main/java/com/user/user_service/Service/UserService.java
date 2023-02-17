package com.user.user_service.Service;

import com.user.user_service.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    List<User> list = List.of(
            new User(1121L, "Khaja", 123456789L),
            new User(1122L, "Chaitanya", 123456L),
            new User(1123L, "Ridhi", 6789L),
            new User(1124L, "Tripathi", 1239L)

    );


    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
