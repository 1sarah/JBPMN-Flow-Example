package com.company.bpmntester.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "BPMNTESTER_USER")
@Entity(name = "bpmntester_User")
@NamePattern("%s|name")
public class User extends StandardEntity {
    private static final long serialVersionUID = 379568564170570213L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "EMAIL")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}