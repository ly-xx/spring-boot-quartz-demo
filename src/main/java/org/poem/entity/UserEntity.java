package org.poem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2018-3-21
 */

@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
