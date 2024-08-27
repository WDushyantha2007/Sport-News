package com.sport.Sport.News.repository;

import com.sport.Sport.News.dto.NewsDto;
import com.sport.Sport.News.entity.NewsCategories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsCategoriesRepository extends CrudRepository<NewsCategories, Integer> {

    @Query("select new NewsDto(n.newsId, n.newsName) from Category c join " +
            "NewsCategories nc on c.categoryID = nc.categoryID join News n on nc.newsId = n.newsId where c.categoryID = ?1")
    public List<NewsDto> findNewsByCategoryID(@Param("categoryID") int categoryID);
}
