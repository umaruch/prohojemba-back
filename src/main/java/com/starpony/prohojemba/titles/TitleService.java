package com.starpony.prohojemba.titles;

import com.starpony.prohojemba.titles.dto.TitleDto;
import com.starpony.prohojemba.titles.dto.TitlesPageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class TitleService {
    private final TitleMapper titleMapper;

    @Autowired
    public TitleService(TitleMapper titleMapper) {
        this.titleMapper = titleMapper;
    }

    public TitlesPageDto getTitlesPage() {
        List<Title> titles = titleMapper.findAll();
        return new TitlesPageDto("All",
                titles.stream().map(TitleDto::new).collect(Collectors.toList()));
    }
}
