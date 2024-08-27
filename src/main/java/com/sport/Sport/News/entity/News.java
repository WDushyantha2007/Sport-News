package com.sport.Sport.News.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "news")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class News {

    @Id
    @Column(name = "news_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int newsId;

    @Column(name = "news_name")
    private String newsName;
}
