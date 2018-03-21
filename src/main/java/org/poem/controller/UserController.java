package org.poem.controller;

import com.daqsoft.commons.responseEntity.BaseResponse;
import org.poem.api.TimeTaskService;
import org.poem.api.UserService;
import org.poem.entity.TimeTask;
import org.poem.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2018-3-21
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    TimeTaskService taskService;

    @RequestMapping(value = "/add")
    public BaseResponse add(TimeTask task){
        taskService.save(task);
        return null;
    }
}
