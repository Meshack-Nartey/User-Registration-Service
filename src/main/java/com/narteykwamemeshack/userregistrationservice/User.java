package com.narteykwamemeshack.userregistrationservice;

public class User {
    public long UserId;
    public String UserName;
    public String UserEmail;
    public String UserPassword;

    public User(long userId, String userName, String userEmail, String userPassword) {
        UserId = userId;
        UserName = userName;
        UserEmail = userEmail;
        UserPassword = userPassword;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }
}
