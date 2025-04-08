package com.scu.gkvr_system_backend.pojo;

import lombok.Data;

import java.util.List;

@Data
public class GetRecoRequest {
    Integer page;
    Integer score;
    String risk;
    String province;
    List<Integer> likeMajorIds;
}
