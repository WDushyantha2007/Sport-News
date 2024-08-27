package com.sport.Sport.News.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "news_comment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewsComment {

    @Id
    @Column(name = "news_comment_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int newCommentID;

    @Column(name = "news_id")
    private int newsID;

    @Column(name = "newsComment")
    private String newsComment;
}
