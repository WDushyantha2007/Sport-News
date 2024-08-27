package com.sport.Sport.News.service;

import com.sport.Sport.News.dto.NewsDto;
import com.sport.Sport.News.repository.NewsCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NewsCategoriesService {

    private NewsCategoriesRepository newsCategoriesRepository;

    @Autowired
    public NewsCategoriesService(NewsCategoriesRepository newsCategoriesRepository) {
        this.newsCategoriesRepository = newsCategoriesRepository;
    }

    public List<NewsDto> findNewsRelatedToCategory(int categoryID) {
        List<NewsDto> newsDtoList = newsCategoriesRepository.findNewsByCategoryID(categoryID);
        return newsDtoList;
    }
}
