package com.huanghy.scaff.service.impl;

import com.huanghy.scaff.domain.User;
import com.huanghy.scaff.mapper.UserMapper;
import com.huanghy.scaff.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-02-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
