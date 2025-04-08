package com.scu.gkvr_system_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scu.gkvr_system_backend.pojo.ScLiScore;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Liyang
 * @description 针对表【sc_li_score】的数据库操作Mapper
 * @createDate 2024-03-30 10:58:49
 * @Entity com.scu.gkvr_system_backend.pojo.ScLiScore
 */
public interface ScLiScoreMapper extends BaseMapper<ScLiScore> {
    @Select("select sc_li_score.* from sc_li_score join school_info on sc_li_score.school_id = school_info.school_id and school_info.province_name = #{province} " +
            "where #{upperRank} <= ((rank2020 + rank2021 + rank2022) / 3) " +
            "and ((rank2020 + rank2021 + rank2022) / 3) <= #{lowerRank} " +
            "order by ((rank2020 + rank2021 + rank2022) / 3) desc")
    List<ScLiScore> selectRankByProvince(int upperRank, int lowerRank, String province);

    @Select("select * from sc_li_score " +
            "where #{upperRank} <= ((rank2020 + rank2021 + rank2022) / 3) " +
            "and ((rank2020 + rank2021 + rank2022) / 3) <= #{lowerRank} " +
            "order by ((rank2020 + rank2021 + rank2022) / 3) desc")
    List<ScLiScore> selectRank(int upperRank, int lowerRank);
}




