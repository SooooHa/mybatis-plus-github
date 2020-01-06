package cn.id;

import cn.id.bean.User;
import cn.id.dao.UserDao;
import cn.id.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 1/4/2020
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceTest {
    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;

    @Test
    public void findTest() {
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    /**
     * mybatis 分页
     */
    @Test
    public void selectByPage() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("sex", "女");
        Page<User> page = new Page<>(1, 2);

        IPage<Map<String, Object>> mapIPage = userDao.selectMapsPage(page, wrapper);
        System.out.println(mapIPage.getPages());
        System.out.println(mapIPage.getTotal());
        List<Map<String, Object>> records = mapIPage.getRecords();
        records.forEach(System.out::print);
    }


    @Test
    public void selectByPage2() {
        Page<User> page = new Page<>(1, 2);
        IPage<User> iPage = userDao.selectPage(page);
        System.out.println(iPage.getPages());
        System.out.println(iPage.getTotal());
        List<User> records = iPage.getRecords();
        for (User record : records) {
            System.out.println(record);
        }


    }





   /* @Test
    public void saveOrUpdate() {
        Collection collection = new ArrayList<User>();
        User user = new User();
        user.setUsername("33");
        User user1 = new User();
        user1.setUsername("55");
        collection.add(user);
        collection.add(user1);
        boolean b = userService.saveOrUpdateBatch(collection);
        System.out.println(b);

    }*/
}
