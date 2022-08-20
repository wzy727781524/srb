package com.wzy.srb.core.service.impl;

import com.wzy.srb.core.pojo.entity.UserInfo;
import com.wzy.srb.core.mapper.UserInfoMapper;
import com.wzy.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author wzy
 * @since 2022-08-20
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
