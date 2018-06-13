package com.fly.springboot.repository;

import com.fly.springboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: fly
 * @Description:
 * @Date: 2018/5/6 11:17
 * @Modified By:
 **/
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
