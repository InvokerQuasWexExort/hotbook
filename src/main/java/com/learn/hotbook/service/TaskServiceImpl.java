package com.learn.hotbook.service;

import com.learn.hotbook.domain.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName TaskServiceImpl
 * @Description
 * @Author chenpeng
 * @Date 2020/7/30 14:40
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService{

    @Override
    public List<Task> getTaskList(int fixedRate) {
        return null;
    }
}
