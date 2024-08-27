package com.sport.Sport.News.repository;
import com.sport.Sport.News.entity.NewsItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsItemRepository extends CrudRepository<NewsItem, Integer> {

    @Query("select * from NewsItem ni where ni.newsID = ?1")
    public NewsItem findNewsItemByNewsID(@Param("newsID") int newsID);
}
