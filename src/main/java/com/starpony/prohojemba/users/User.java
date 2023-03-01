package com.starpony.prohojemba.users;


import com.starpony.prohojemba.security.Permissions;

public class User {
    private int id;
    private String email;
    private String username;
    private String encoded_password;
    private boolean isActive;
    private boolean isLocked;

    private Permissions permissions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEncoded_password() {
        return encoded_password;
    }

    public void setEncoded_password(String encoded_password) {
        this.encoded_password = encoded_password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }
}
