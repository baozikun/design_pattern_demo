package com.bz.service.impl;

import com.bz.mapper.DevUserMapper;
import com.bz.pojo.DevUser;
import com.bz.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("devUserService")
public class DevUserServiceImpl implements DevUserService {
    @Autowired
    private DevUserMapper devUserMapper;
    @Override
    public DevUser login(DevUser devUser) {
        List<DevUser> users = devUserMapper.queryByCodePwd(devUser);
        if(users !=null && users.size() ==1){
            return users.get(0);
        }
        return null;
    }
}
