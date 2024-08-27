package com.sport.Sport.News.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "news_categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewsCategories {

    @Id
    @Column(name = "news_category_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int newsCategoryID;

    @Column(name = "news_id")
    private int newsID;

    @Column(name = "category_id")
    private int categoryID;


}
