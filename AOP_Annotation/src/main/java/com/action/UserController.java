package com.action;

import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/1 10:54
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired private IUserService userService;

    @RequestMapping(value = "/findUserNameByTel/{tel}")
    public String findUserNameByTel(@PathVariable("tel")String tel){
        return userService.findUserName(tel);
    }
}
