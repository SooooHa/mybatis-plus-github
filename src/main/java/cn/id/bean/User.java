package cn.id.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 1/2/2020
 */
@Data
@TableName("user")
public class User {
    @TableId(value = "id")
    private Integer id;
    private Integer age;
    private String username;
    private String password;
    private String email;
    private String sex;
}
