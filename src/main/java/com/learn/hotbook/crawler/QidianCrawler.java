package com.learn.hotbook.crawler;

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
public class QidianCrawler {

    private static final Logger LOG = LoggerFactory.getLogger(QidianCrawler.class);

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private PhantomJsTemplate template;

    public void parseHtml() {
        Book book = bookMapper.findById(1);
        System.out.println(book.getName());
        String html = template.catchHtml("https://www.qidian.com/");
        if (!StringUtils.isEmpty(html)) {
            Document document = Jsoup.parse(html);
            Elements elements = document.select("div.book-list-wrap.mr30.fl div.book-list ul li");
            for (int i = 0; i <elements.size() ; i++) {
                Element element = elements.get(i);
                String name = element.select("a.name").html();
                System.out.println(name);
            }
        }
    }
}
