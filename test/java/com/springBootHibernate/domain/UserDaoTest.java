package com.springBootHibernate.domain;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;


/**
 * https://github.com/zsl131/spring-boot-test/commit/beba2856dd7477d728929fff1d956ed94117cc93
 * Created by fionalyn.ping.fu on 2/23/2017.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    DataSource dataSource;

    @Autowired
    EntityManager entityManager;

    @Autowired
    EntityManagerFactory entityManagerFactory;

    private static Logger LOGGER = LoggerFactory.getLogger(UserDaoTest.class);
    @Test
    public void findByEmail() throws Exception {
        User testUser = userDao.findById(2);
        System.out.println("testUser" + testUser.toString());
       // 这里将数据源输入看看，它为我们提供的数据源是什么数据源
        LOGGER.info("dataSource:{}",dataSource);
        System.out.println("打印出的正在使用的数据源：" + dataSource);
    }

    @Test
    public void emSelect() throws Exception {
        User testUser = new User("springtest@163.com", "testspringjpa");
        System.out.println("testUser" + testUser.toString());
        Query query = entityManager.createNativeQuery("select * from users");
        List resultList = query.getResultList();
        System.out.println("结果" + resultList.size());
//        for (int i = 0; i < resultList.size() ; i++) {
//            System.out.println("使用entityManager" + resultList.get(i).toString());
//        }
    }

    @Test
    public void emFactoryTest() throws  Exception {
//       EntityManager em2 = entityManagerFactory.createEntityManager();
//        query = em2.createQuery("update User as U set U.email = ?1  where U.id = ?2");
//        query.setParameter(1, "testemf@163.com");
//       query.setParameter(2, 1l);
//       query.executeUpdate();
        userDao.emFactoryUpdate("testemf@163.com",2);
    }


}