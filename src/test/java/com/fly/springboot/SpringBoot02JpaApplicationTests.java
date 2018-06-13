package com.fly.springboot;

import com.fly.springboot.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02JpaApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    PersonRepository personRepository;
    @Test
    public void contextLoads() {
        System.out.println(dataSource);
    }

}
