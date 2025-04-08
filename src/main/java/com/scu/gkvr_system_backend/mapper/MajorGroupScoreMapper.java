package com.scu.gkvr_system_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scu.gkvr_system_backend.pojo.MajorGroup;
import com.scu.gkvr_system_backend.pojo.MajorGroupScore;
import com.scu.gkvr_system_backend.pojo.vo.MajorGroupScoreVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MajorGroupScoreMapper extends BaseMapper<MajorGroupScore> {

    @Select("<script>" +
            "SELECT mgs.* FROM major_group_score mgs JOIN major_group_major mgm " +
            "on mgs.major_group_id = mgm.major_group_id  and mgs.school_id = #{schoolId} " +
            "<if test='likeMajorIds != null and likeMajorIds.size() != 0'> and mgm.major_id in" +
            "<foreach collection='likeMajorIds' open='(' separator=',' close=')' item='id' index='index'> " +
            "            #{id} " +
            "        </foreach> </if>" +
            "group by mgs.major_group_id " +
            "</script>")
    List<MajorGroupScoreVo> selectBySchoolId(@Param("schoolId") Integer schoolId, @Param("likeMajorIds") List<Integer> likeMajorIds);
}




