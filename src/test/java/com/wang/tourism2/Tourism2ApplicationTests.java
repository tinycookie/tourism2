package com.wang.tourism2;

import com.wang.tourism2.entity.BusEntity;
import com.wang.tourism2.entity.ScenicEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tourism2ApplicationTests {

    @Test
    public void contextLoads() {
    }

    /***
     * Bus外检测室
     */
    @Test
    public void addStudents() {
       /* //创建配置对象
        Configuration config = new Configuration().configure();
        //创建服务注册对象
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        //创建会话工厂对象
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        //创建会话
        Session session = sessionFactory.getCurrentSession();
        //开启事务
        Transaction tx = session.beginTransaction();*/

        /*StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build();*/
       /* SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        // 会话对象
        Session session = sessionFactory.openSession();
        // 开启事务
        Transaction transaction = session.beginTransaction();

        //先生成一个景区对象
        ScenicEntity scenicEntity = new ScenicEntity();
        scenicEntity.setSname("test");
        scenicEntity.setScomment("test");
        scenicEntity.setSprice(11.1);
        scenicEntity.setsOpentime("test");
        //再生成公交车对象
        BusEntity busEntity = new BusEntity();
        busEntity.setBname("test");
        busEntity.setBstarttime(new Timestamp(new Date().getTime()));
        busEntity.setBendtime(new Timestamp(new Date().getTime()));
        busEntity.setBnum("test");
        busEntity.setScenic(scenicEntity);
        //先保存身份证类对象
        session.save(scenicEntity);
        session.save(busEntity);

        //提交事务
        transaction.commit();*/
    }

    @Test
    public void arrayTest(){
        int[][] arr = new int[5][6];
        System.out.println(arr.length);
        System.out.println(arr[0].length);

    }

    @Test
    public void comperTest(){
        String a = "789";
        String b = "456";
        System.out.println(a.compareTo(b));
    }

}
