package com.airtribe.NewsAggregatorAPI.service;

import com.airtribe.NewsAggregatorAPI.entity.NewsArticle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {
    List<NewsArticle> getNews(String username);
}
