package com.scu.gkvr_system_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scu.gkvr_system_backend.pojo.User;
import com.scu.gkvr_system_backend.pojo.vo.UserScoreVo;

/**
 * @author Liyang
 * @description 针对表【user】的数据库操作Service
 * @createDate 2024-03-30 10:58:49
 */
public interface UserService extends IService<User> {

    Boolean login(User user);

    Boolean register(User user);

    void saveScore(UserScoreVo userScoreVo);

    UserScoreVo getScore(String id);
}
