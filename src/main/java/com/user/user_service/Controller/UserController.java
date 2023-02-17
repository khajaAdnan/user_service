package com.user.user_service.Controller;

import com.user.user_service.Entity.Contact;
import com.user.user_service.Entity.User;
import com.user.user_service.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public User getUser(@RequestParam Long userId){
    User user =  userService.getUser(userId);
    List Contacts = this.restTemplate.getForObject("http://localhost:9002/contact/"+user.getUserId(), List.class);
    user.setContactList(Contacts);
    return user;
    }
}