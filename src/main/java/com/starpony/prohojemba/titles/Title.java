package com.starpony.prohojemba.titles;

import com.starpony.prohojemba.states.TitleState;
import com.starpony.prohojemba.types.Type;


public class Title {
    private int id;
    private String name;
    private String coverUrl;
    private Type type;
    private TitleState state; // Состояние "употребления" тайтла у пользователя

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public TitleState getState() {
        return state;
    }

    public void setState(TitleState state) {
        this.state = state;
    }
}
