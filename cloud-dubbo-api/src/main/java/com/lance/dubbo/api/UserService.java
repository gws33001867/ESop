package com.lance.dubbo.api;

import com.lance.dubbo.dto.UserDTO;

/**
 * @author sgw
 * @date 2021/5/13 14:43
 */
public interface UserService {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    UserDTO get(Integer id);

    /**
     * dubbo测试
     * @param message
     * @return
     */
    String dubboTest(String message);
}
