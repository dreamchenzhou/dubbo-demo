package com.dubbo.demo.dubboconsumor.controller;

import com.dubbo.demo.api.UserInfoService;
import com.dubbo.demo.dubboconsumor.bean.UserInfoParam;
import com.dubbo.demo.pojo.UserInfoDTO;
import com.dubbo.demo.pojo.UserInfoVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 客户信息控制层
 * @Author lz.wang
 * @Since 1.0
 * @Date 2019/11/19
 */
@RestController
public class UserInfoController {

    //忽略启动校验，与@Service配合
    @Reference(check=false,retries = 1,timeout = 10000)
    private UserInfoService userInfoService;

    @RequestMapping("/getUserInfoById")
    public UserInfoVO getUserInfoById(Long id){

        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping("/getUserInfo")
    public UserInfoVO getUserInfo(UserInfoParam userInfoParam){

        UserInfoDTO dto = new UserInfoDTO();
        dto.setId(userInfoParam.getId());
        dto.setName(userInfoParam.getName());
        dto.setAge(userInfoParam.getAge());
        return userInfoService.getUserInfo(dto);
    }

}