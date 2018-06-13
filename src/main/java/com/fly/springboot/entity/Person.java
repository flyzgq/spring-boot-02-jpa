package com.fly.springboot.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Auther: fly
 * @Description:
 * @Date: 2018/5/6 11:12
 * @Modified By:
 **/
@Entity
@Table(name = "jpa_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    @Temporal(TemporalType.DATE)
    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
