package com.learn.hotbook.schedule;

import com.learn.hotbook.crawler.CrawlerEngine;
import com.learn.hotbook.domain.Task;
import com.learn.hotbook.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ScheduleEngine {

    @Autowired
    private CrawlerEngine crawler;

    @Autowired
    private TaskService taskService;

    @Scheduled(fixedRate = 1000 * 60 * 60)
    protected void excuteOnefixedRate() {
        List<Task> taskList = taskService.getTaskList(1);
        if (!taskList.isEmpty()) {
            taskList.forEach(task -> crawler.parseHtml(task));
        }
    }

    @Scheduled(fixedRate = 1000 * 60 * 60 * 3)
    protected void excuteThreefixedRate() {
        List<Task> taskList = taskService.getTaskList(3);
        if (!taskList.isEmpty()) {
            taskList.forEach(task ->
                    crawler.parseHtml(task));
        }
    }
}
