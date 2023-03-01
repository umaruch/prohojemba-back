package com.starpony.prohojemba.states;

import com.starpony.prohojemba.titles.Title;
import com.starpony.prohojemba.users.User;

public class TitleState {
    private User user;
    private Title title;
    private String state;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
