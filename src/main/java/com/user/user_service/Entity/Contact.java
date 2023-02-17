package com.user.user_service.Entity;

public class Contact {
    private Long contactId;
    private String eMail;
    private String contactName;
    private Long userId;

    public Contact(Long contactId, String eMail, String contactName, Long userId) {
        this.contactId = contactId;
        this.eMail = eMail;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
