package com.servervalidation.servervalidationapp.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class LoginData {

    @NotBlank(message = "User name canot be empty")
    @Size(min = 3,max = 12,message = "UserName must be between 3 - 12 character")
    private String userName;
    
    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "invalid email")
    private String userEmail;
    
    @AssertTrue(message = "Agree Term and condition")
    private boolean termAndCondition;

    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) { 
        this.userName = userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    @Override
    public String toString() {
        return "LoginData [userName=" + userName + ", userEmail=" + userEmail + "]";
    }
    public boolean getTermAndCondition() {
        return termAndCondition;
    }
    public void setTermAndCondition(boolean termAndCondition) {
        this.termAndCondition = termAndCondition;
    }
    
    


    
}
