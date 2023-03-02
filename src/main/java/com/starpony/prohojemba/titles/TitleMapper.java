package com.starpony.prohojemba.titles;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface TitleMapper {
    @Select("SELECT * FROM titles")
    List<Title> findAll();
}
