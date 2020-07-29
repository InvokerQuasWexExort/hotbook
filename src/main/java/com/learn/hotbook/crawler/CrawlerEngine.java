package com.learn.hotbook.crawler;

import com.alibaba.fastjson.JSONObject;
import com.learn.hotbook.domain.Task;
import com.learn.hotbook.mapper.BookMapper;
import com.learn.hotbook.domain.Book;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


@Component
public class CrawlerEngine {

    private static final Logger LOG = LoggerFactory.getLogger(CrawlerEngine.class);

    @Autowired
    private PhantomJsTemplate template;

    public void parseHtml(Task task) {
        LOG.info("CrawlerEngine start parse=====>" + JSONObject.toJSONString(task));
        String html = template.catchHtml(task.getUrl());
        if (!StringUtils.isEmpty(html)) {
            Document document = Jsoup.parse(html);
            try {
                Elements elements = document.select(task.getCssQuery());
                if (elements != null && elements.size() > 0) {
                    for (int i = 0; i < elements.size(); i++) {
                        Element element = elements.get(i);
                        Book book = new Book();
                        String name = element.select(task.getNamePath()).html();
                        System.out.println(name);
                    }
                } else {
                    LOG.info("CrawlerEngine parse error,taskId=====>" + task.getId());
                }
            } catch (Exception e) {
                LOG.error("CrawlerEngine parse error,taskId=====>" + task.getId(), e);
                e.printStackTrace();
            }

        }
    }
}
