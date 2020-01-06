package cn.id.service.impl;

import cn.id.bean.User;
import cn.id.dao.UserDao;
import cn.id.service.UserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 1/2/2020
 */
@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

    @Transactional
    @Override
    public int insertUser(User user) {
        return baseMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return baseMapper.updateById(user);
    }

    @Override
    public int deleteUser(User user) {
        return baseMapper.deleteById(user.getId());
    }

    @Override
    public List<User> findAll() {
        return baseMapper.selectList(null);
    }


    @Override
    public User findUserById(String id) {
        return baseMapper.selectById(id);
    }

    @Override
    public IPage getUserPage(Page page, User user) {
        return baseMapper.getUsersPage(page, user);
    }


    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList) {
        return baseMapper.saveOrUpdateBatch(entityList);
    }


}
