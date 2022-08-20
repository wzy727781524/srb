package com.wzy.srb.core.service.impl;

import com.wzy.srb.core.pojo.entity.UserLoginRecord;
import com.wzy.srb.core.mapper.UserLoginRecordMapper;
import com.wzy.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author wzy
 * @since 2022-08-20
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
