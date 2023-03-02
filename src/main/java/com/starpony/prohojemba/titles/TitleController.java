package com.starpony.prohojemba.titles;

import com.starpony.prohojemba.titles.dto.TitlesPageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1/titles")
public class TitleController {
    private final TitleService titleService;

    @Autowired
    public TitleController(TitleService titleService) {
        this.titleService = titleService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public TitlesPageDto getTitlesPage() {
        return titleService.getTitlesPage();
    }
}
