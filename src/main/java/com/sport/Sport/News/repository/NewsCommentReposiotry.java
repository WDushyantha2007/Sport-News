package com.sport.Sport.News.repository;

import com.sport.Sport.News.entity.NewsComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsCommentReposiotry extends CrudRepository<NewsComment, Integer> {
}
