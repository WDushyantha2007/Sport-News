package com.sport.Sport.News.controller;


import com.sport.Sport.News.entity.NewsItem;
import com.sport.Sport.News.service.NewsItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsItemController {

    private NewsItemService newsItemService;

    @GetMapping("/newsitem/news/{newsid}")
    public ResponseEntity<NewsItem> findNewsItemByNewsID(@PathVariable("newsid") int newsid) {
        return new ResponseEntity<>(newsItemService.findNewsItemByID(newsid), HttpStatus.OK);
    }
}
