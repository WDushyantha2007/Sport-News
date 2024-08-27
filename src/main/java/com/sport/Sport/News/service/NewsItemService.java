package com.sport.Sport.News.service;

import com.sport.Sport.News.entity.NewsItem;
import com.sport.Sport.News.repository.NewsItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsItemService {

    @Autowired
    private NewsItemRepository newsItemRepository;

    public NewsItem findNewsItemByID(int newsID) {
        return newsItemRepository.findNewsItemByNewsID(newsID);
    }

}
