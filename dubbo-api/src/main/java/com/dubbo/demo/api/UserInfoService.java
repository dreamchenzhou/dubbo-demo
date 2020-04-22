package com.dubbo.demo.api;


import com.dubbo.demo.pojo.UserInfoDTO;
import com.dubbo.demo.pojo.UserInfoVO;

public interface UserInfoService {

    UserInfoVO getUserInfo(UserInfoDTO dto);

    UserInfoVO getUserInfoById(Long id);
}