package org.poem.api;

import org.poem.entity.TimeTask;

import java.sql.Time;
import java.util.List;

public interface TimeTaskService {

    /**
     * 查詢全部的數據
     * @return
     */
    List<TimeTask> findAllTask();

    TimeTask save(TimeTask task);
}
