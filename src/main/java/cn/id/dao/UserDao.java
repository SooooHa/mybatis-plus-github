package cn.id.dao;

import cn.id.bean.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 1/2/2020
 */
public interface UserDao extends BaseMapper<User> {

    // 分页查询
    IPage<List<User>> getUsersPage( Page page, @Param("query") User user );

    boolean saveOrUpdateBatch(Collection<User> entityList);

    @Override
    IPage<User> selectPage(IPage<User> page, @Param(Constants.WRAPPER) Wrapper<User> queryWrapper);

    IPage<User> selectPage(IPage<User> page);
}
