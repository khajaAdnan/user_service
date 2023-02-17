package com.user.user_service.Entity;

import java.util.List;

public class User {

    private Long userId;
    private String userName;
    private Long mobileNumber;

    private List<Contact> contactList;

    public User(Long userId, String userName, Long mobileNumber, List<Contact> contactList) {
        this.userId = userId;
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.contactList = contactList;
    }

    public User(Long userId, String userName, Long mobileNumber) {
        this.userId = userId;
        this.userName = userName;
        this.mobileNumber = mobileNumber;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
