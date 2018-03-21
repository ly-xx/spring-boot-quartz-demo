package org.poem.dao;

import org.poem.basic.BaseDao;
import org.poem.entity.TimeTask;
import org.poem.entity.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2018-3-21
 */

public interface UserDao extends BaseDao<UserEntity,String> {

    @Modifying
    @Query(value = "update UserEntity set name = ?2 where id = ?1")
    int updateNameById(Long id, String name);
}
