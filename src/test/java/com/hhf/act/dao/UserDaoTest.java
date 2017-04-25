package com.hhf.act.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by haohaifeng on 2017/4/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/applicationContext.xml","classpath:/META-INF/hibernate.xml", "classpath*:/WEB-INF/springmvc-servlet.xml"})
public class UserDaoTest {
//    @Autowired
//    private UserDao userDao;

    @Test
    public void testFindAll(){
//        userDao.findAll();
        System.out.print("dsdfsd");
    }

}
