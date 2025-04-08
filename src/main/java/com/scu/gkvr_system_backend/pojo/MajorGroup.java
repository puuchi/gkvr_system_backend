package com.scu.gkvr_system_backend.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName major_info
 */
@TableName(value = "major_group")
@Data
public class MajorGroup implements Serializable {
    @TableId
    private Integer id;

    private String name;

    private String schoolId;
    @Serial
    private static final long serialVersionUID = 1L;
}
