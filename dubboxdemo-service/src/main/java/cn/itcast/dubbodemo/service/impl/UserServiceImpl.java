package cn.itcast.dubbodemo.service.impl;

import cn.itcast.dubbodemo.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author 宁三水
 * @version 1.0
 * @descript cn.itcast.dubbodemo.service.impl
 * @date 2019/6/12
 */


@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "itheima";
    }
}
