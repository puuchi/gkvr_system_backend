package com.scu.gkvr_system_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scu.gkvr_system_backend.pojo.MajorGroupMajor;
import com.scu.gkvr_system_backend.pojo.MajorScore;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MajorGroupMajorMapper extends BaseMapper<MajorGroupMajor> {

    @Select("select ms.* from major_info mi join major_group_major mgm " +
            "on mgm.major_id = mi.major_id and mgm.major_group_id = #{majorGroupId} " +
            "join major_score ms on ms.major_id = mi.major_id")
    List<MajorScore> listByMajorGroupId(int majorGroupId);
}




