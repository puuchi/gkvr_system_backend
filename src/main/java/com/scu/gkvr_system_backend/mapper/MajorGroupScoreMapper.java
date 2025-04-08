package com.scu.gkvr_system_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scu.gkvr_system_backend.pojo.MajorGroup;
import com.scu.gkvr_system_backend.pojo.MajorGroupScore;
import com.scu.gkvr_system_backend.pojo.vo.MajorGroupScoreVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MajorGroupScoreMapper extends BaseMapper<MajorGroupScore> {

    @Select("SELECT mgs.* FROM major_group_score mgs JOIN major_group_major mgm " +
            "on mgs.major_group_id = mgm.major_group_id  and mgs.school_id = #{schoolId} " +
            "group by mgs.major_group_id ")
    List<MajorGroupScoreVo> selectBySchoolId(Integer schoolId);
}




