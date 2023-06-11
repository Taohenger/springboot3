package com.example.springboot.service;

import com.example.springboot.controller.dto.UserDTO;
import com.example.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 陶恒
 * @since 2023-06-09
 */
public interface IUserService extends IService<User> {

    boolean login(UserDTO userDTO);
}
