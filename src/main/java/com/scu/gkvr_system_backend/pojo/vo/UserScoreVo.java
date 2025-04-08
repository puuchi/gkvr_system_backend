package com.scu.gkvr_system_backend.pojo.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName user
 */
@Data
public class UserScoreVo implements Serializable {
    private String username;

    private String province;

    private String score;

    private String majorA;

    private String majorB;

    private String majorC;

    private Integer rank;

    @Serial
    private static final long serialVersionUID = 1L;
}
