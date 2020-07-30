package com.learn.hotbook.mapper;

import com.learn.hotbook.domain.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface TaskMapper {

    List<Task> findByFixedRate(@Param("fixedRate") int fixedRate);
}
