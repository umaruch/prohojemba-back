package com.starpony.prohojemba.titles.dto;

import com.starpony.prohojemba.titles.Title;

public class TitleDto {
    private int id;
    private String name;
    private String coverUrl;
    private String type;
    private String state;

    public TitleDto(Title title) {
        this.id = title.getId();
        this.name = title.getName();
        this.coverUrl = title.getCoverUrl();
        //this.type = title.getType().getCodeName();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public String getType() {
        return type;
    }

    public String getState() {
        return state;
    }
}
