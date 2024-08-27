package com.sport.Sport.News.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "news_item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewsItem {

    @Id
    @Column(name = "news_item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int newsItemID;

    @Column(name = "news_id")
    private int newsID;

    @Column(name = "news_item_name")
    private String newsItemName;
}
