package com.lance.dubbo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sgw
 * @date 2021/5/13 14:47
 */
@Data
public class UserDTO implements Serializable {

    private Integer id;

    private String name;

    private Integer gender;
}
