package com.example.springboot.service.impl;

import cn.hutool.log.Log;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot.controller.dto.UserDTO;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陶恒
 * @since 2023-06-09
 * 实现登录
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    private  static final Log LOG=Log.get();

    @Override
    public boolean login(UserDTO userDTO) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("username",userDTO.getUsername());
        queryWrapper.eq("password",userDTO.getPassword());
        try{
            User one = getOne(queryWrapper);
            return one !=null;
        } catch (Exception e) {
            LOG.error(e);
            return false;
        }



    }
}
