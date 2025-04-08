package com.scu.gkvr_system_backend.pojo.vo;

import com.scu.gkvr_system_backend.pojo.MajorGroupScore;
import lombok.Data;

/**
 * @TableName major_info
 */
@Data
public class MajorGroupScoreVo extends MajorGroupScore {
    /**
     * 录取概率
     */
    private Double admissionRate;
}
