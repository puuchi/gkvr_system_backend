package com.scu.gkvr_system_backend.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName major_info
 */
@TableName(value = "major_group_score")
@Data
public class MajorGroupScore implements Serializable {
    @TableId
    private Integer id;

    private Integer majorGroupId;

    private String majorGroupName;

    private Integer score2021;

    private Integer rank2021;

    private Integer score2023;

    private Integer rank2023;

    private Integer score2022;

    private Integer rank2022;

    private String schoolId;
    @Serial
    private static final long serialVersionUID = 1L;
}
