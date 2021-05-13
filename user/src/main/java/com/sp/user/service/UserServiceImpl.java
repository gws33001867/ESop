package com.sp.user.service;

import com.lance.dubbo.api.UserService;
import com.lance.dubbo.dto.UserDTO;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author sgw
 * @date 2021/5/13 15:06
 */
@DubboService
public class UserServiceImpl implements UserService {

    private static final String HI_DUBBO = "你好，dubbo";

    @Override
    public UserDTO get(Integer id) {
        return null;
    }

    @Override
    public String dubboTest(String message) {
        return HI_DUBBO+message;
    }
}
