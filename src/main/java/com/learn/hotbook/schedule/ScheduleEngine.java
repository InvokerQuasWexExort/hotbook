package com.learn.hotbook.schedule;

import com.learn.hotbook.crawler.CrawlerEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleEngine {

    @Autowired
    private CrawlerEngine crawler;

//    @Scheduled(fixedRate = 1000 * 60 * 60)
//    protected void excute() {
//        crawler.parseHtml();
//    }
}
