package com.hatrick.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "manager")
public class Manager extends AbstractEntity {

    @NotEmpty(message = "Password is not empty!")
    protected String password;
    @NotEmpty(message = "Name is not empty!")
    private String name;
    @Email
    @NotEmpty(message = "E-mail is not empty!")
    private String email;

    @NotEmpty(message = "UserName is not empty!")
    private String username;


    public Manager(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
