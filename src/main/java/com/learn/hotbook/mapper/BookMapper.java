package com.learn.hotbook.mapper;

import com.learn.hotbook.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface BookMapper{

    Book findById(@Param("id") int id);
}
