package com.learn.hotbook.service;

import com.learn.hotbook.domain.Book;
import com.learn.hotbook.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Description
 * @Author chenpeng
 * @Date 2020/7/30 17:33
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public void insertBookList(List<Book> list) {
        bookMapper.insertBatch(list);
    }
}
