package com.scu.gkvr_system_backend.pojo.vo;

import com.scu.gkvr_system_backend.pojo.ScLiScore;
import lombok.Data;

import java.util.List;

/**
 * @TableName sc_li_score
 */
@Data
public class ScLiScoreVo extends ScLiScore {
    private List<MajorGroupScoreVo> majorGroups;
    private Integer upLineRate;
}
