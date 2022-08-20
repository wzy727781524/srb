package com.wzy.srb.core.service.impl;

import com.wzy.srb.core.pojo.entity.UserAccount;
import com.wzy.srb.core.mapper.UserAccountMapper;
import com.wzy.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author wzy
 * @since 2022-08-20
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
