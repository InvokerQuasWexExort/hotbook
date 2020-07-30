package com.learn.hotbook.service;

import com.learn.hotbook.domain.Task;

import java.util.List;

public interface TaskService {

    List<Task> getTaskList(int fixedRate);
}
