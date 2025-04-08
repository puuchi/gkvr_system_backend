package com.scu.gkvr_system_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scu.gkvr_system_backend.mapper.MajorGroupScoreMapper;
import com.scu.gkvr_system_backend.pojo.MajorGroupScore;
import com.scu.gkvr_system_backend.pojo.vo.MajorGroupScoreVo;
import com.scu.gkvr_system_backend.service.MajorGroupScoreService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liyang
 * @description 针对表【major_info】的数据库操作Service实现
 * @createDate 2024-03-30 09:57:35
 */
@Service
public class MajorGroupScoreServiceImpl extends ServiceImpl<MajorGroupScoreMapper, MajorGroupScore>
        implements MajorGroupScoreService {

    @Resource
    private MajorGroupScoreMapper majorGroupScoreMapper;

    @Override
    public List<MajorGroupScoreVo> getMajorGroupVoBySchoolId(Integer schoolId, List<Integer> likeMajorIds) {
       return majorGroupScoreMapper.selectBySchoolId(schoolId, likeMajorIds);
    }
}




