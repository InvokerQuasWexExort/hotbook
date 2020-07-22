package com.learn.hotbook.schedule;

import com.learn.hotbook.crawler.QidianCrawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleEngine {

    @Autowired
    private QidianCrawler crawler;

    @Scheduled(fixedRate = 1000 * 60 * 60)
    protected void excute() {
        crawler.parseHtml();
    }
}
