package com.starpony.prohojemba.titles.dto;

import java.util.List;


public class TitlesPageDto {
    private String type;
    private List<TitleDto> titles;

    public TitlesPageDto(String type, List<TitleDto> titles) {
        this.type = type;
        this.titles = titles;
    }

    public String getType() {
        return type;
    }

    public List<TitleDto> getTitles() {
        return titles;
    }
}
