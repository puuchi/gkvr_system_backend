package com.scu.gkvr_system_backend.controller;

import com.scu.gkvr_system_backend.pojo.MajorScore;
import com.scu.gkvr_system_backend.pojo.vo.OptionVo;
import com.scu.gkvr_system_backend.service.MajorInfoService;
import com.scu.gkvr_system_backend.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liyang
 * @since 2023-07-14
 */
@RestController
@RequestMapping("/majorInfo")
@CrossOrigin
public class MajorInfoController {

    @Autowired
    private MajorInfoService majorInfoService;

    @GetMapping("/getSortedMajors")
    public Result<Map<String, Object>> getSortedMajors(@RequestParam int page,
                                                       @RequestParam String type) {
        Map<String, Object> data = majorInfoService.getSortedMajors(page, type);
        if (data != null) {
            return Result.success(data);
        }
        return Result.fail("查询失败");
    }

    @GetMapping("/options")
    public Result<List<OptionVo>> getSortedMajors() {
        List<OptionVo> data = majorInfoService.getMajorOptions();
        if (data != null) {
            return Result.success(data);
        }
        return Result.fail("查询失败");
    }

    @GetMapping("/searchByName")
    public Result<Map<String, Object>> majorSearchByName(@RequestParam int page,
                                                         @RequestParam String majorName) {
        Map<String, Object> data = majorInfoService.SearchByName(page, majorName);
        if (data != null) {
            return Result.success(data);
        }
        return Result.fail("查询失败");
    }

    @GetMapping("/list/{majorGroupId}")
    public Result<List<MajorScore>> listByMajorGroupId(@PathVariable int majorGroupId) {
        List<MajorScore> data = majorInfoService.listByMajorGroupId(majorGroupId);
        if (data != null) {
            return Result.success(data);
        }
        return Result.fail("查询失败");
    }
}
