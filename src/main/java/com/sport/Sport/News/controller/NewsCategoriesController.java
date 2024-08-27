package com.sport.Sport.News.controller;

import com.sport.Sport.News.dto.NewsDto;
import com.sport.Sport.News.service.NewsCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsCategoriesController {

    @Autowired
    private NewsCategoriesService newsCategoriesService;

    @GetMapping("/news/category/{categoryID}")
    public ResponseEntity<List<NewsDto>> findNewsByCategoryID(@PathVariable("categoryID") int categoryID) {
        return new ResponseEntity<>(newsCategoriesService.findNewsRelatedToCategory(categoryID), HttpStatus.OK);
    }
}
