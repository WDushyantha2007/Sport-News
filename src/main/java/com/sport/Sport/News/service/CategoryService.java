package com.sport.Sport.News.service;

import com.sport.Sport.News.entity.Category;
import com.sport.Sport.News.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category findCategoryById(int categoryID) {
        Optional<Category> category = categoryRepository.findById(categoryID);
        return category.get();
    }
}
