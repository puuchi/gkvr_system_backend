package com.scu.gkvr_system_backend.pojo.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.scu.gkvr_system_backend.pojo.MajorGroup;
import lombok.Data;

/**
 * @TableName major_info
 */
@TableName(value = "major_info")
@Data
public class MajorGroupVo extends MajorGroup {
    private Double admissionRate;
}
