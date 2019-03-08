package com.bz.mapper;

import com.bz.pojo.DevUser;

import java.util.List;

public interface DevUserMapper {
    List<DevUser> queryByCodePwd(DevUser devUser);
}