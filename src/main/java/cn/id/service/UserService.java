package cn.id.service;

import cn.id.bean.User;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 1/2/2020
 */
public interface UserService {
    int insertUser( User user );
    int updateUser( User user );
    int deleteUser( User user );
    User findUserById(String id);
    IPage<List<User>> getUserPage (Page page, @Param("query") User user );



}
