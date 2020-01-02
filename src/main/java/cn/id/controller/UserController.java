package cn.id.controller;
import cn.id.bean.User;
import cn.id.service.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 1/2/2020
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/delete")
    public Object delete( @RequestBody User user) {
        return userService.deleteUser(user);
    }

    @GetMapping(value = "/getById")
    public Object getUserById(@RequestParam String id){
        return userService.findUserById(id);
    }

    @PostMapping(value = "/insert")
    public Object insert(@RequestBody User user){
        return userService.insertUser(user);
    }

    // 改
    @PostMapping( value = "/update")
    public Object update( @RequestBody User user ) {
        return userService.updateUser(user);
    }

    @GetMapping( value = "/page")
    public Object getUserPage(Page page,@RequestBody User user ) {
        return userService.getUserPage(page, user);
    }

}
