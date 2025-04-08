package com.scu.gkvr_system_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scu.gkvr_system_backend.pojo.MajorGroupScore;
import com.scu.gkvr_system_backend.pojo.vo.MajorGroupScoreVo;

import java.util.List;

/**
 * @author Liyang
 * @description 针对表【major_group】的数据库操作Service
 * @createDate 2024-03-30 10:58:49
 */
public interface MajorGroupScoreService extends IService<MajorGroupScore> {

    List<MajorGroupScoreVo> getMajorGroupVoBySchoolId(Integer id);
}
