package com.learn.hotbook.mapper;

import com.learn.hotbook.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface BookMapper{

    Book findById(@Param("id") int id);

    int insertBatch(@Param("list") List<Book> list);
}
