package com.service.impl;

import com.annotation.Log;
import com.enums.OperationType;
import com.enums.OperationUnit;
import com.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/1 10:52
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Log(detail = "通过手机号[{{tel}}]获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    @Override
    public String findUserName(String tel) {
        System.out.println("tel"+tel);
        return "mike";
    }
}
