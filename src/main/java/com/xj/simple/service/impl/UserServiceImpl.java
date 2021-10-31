package com.xj.simple.service.impl;

import com.xj.simple.domain.po.User;
import com.xj.simple.mapper.UserMapper;
import com.xj.simple.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xj
 * @since 2021-10-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
