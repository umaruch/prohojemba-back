package com.starpony.prohojemba.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.HashSet;
import java.util.Set;


public class Permissions {
    private boolean permEditTitles;
    private boolean permEditTypes;
    private boolean permEditUsers;

    public Set<SimpleGrantedAuthority> toAuthorities() {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        if (permEditTitles) authorities.add(new SimpleGrantedAuthority(Permission.PERM_EDIT_TITLES.name()));
        if (permEditTypes) authorities.add(new SimpleGrantedAuthority(Permission.PERM_EDIT_TYPES.name()));
        if (permEditUsers) authorities.add(new SimpleGrantedAuthority(Permission.PERM_EDIT_USERS.name()));
        return authorities;
    }

    public void setPermEditTitles(boolean permEditTitles) {
        this.permEditTitles = permEditTitles;
    }

    public void setPermEditTypes(boolean permEditTypes) {
        this.permEditTypes = permEditTypes;
    }

    public void setPermEditUsers(boolean permEditUsers) {
        this.permEditUsers = permEditUsers;
    }
}
