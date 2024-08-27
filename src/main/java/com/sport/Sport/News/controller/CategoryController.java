package com.sport.Sport.News.controller;

import com.sport.Sport.News.entity.Category;
import com.sport.Sport.News.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService  categoryService;

    @GetMapping("/category/{id}")
    public ResponseEntity<Category> findCategoryByID(@PathVariable("id") int id) {
        return new ResponseEntity<>(categoryService.findCategoryById(id), HttpStatus.OK);
    }
}
