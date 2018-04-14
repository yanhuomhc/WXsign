package com.yanhuo.sign.controller;

import com.yanhuo.sign.dal.mapper.SignMapper;
import com.yanhuo.sign.dal.model.Sign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 烟火（yanhuo@maihaoche.com）
 * @version V1.0
 * @Description: TODO
 * @date 2018/3/19 下午7:57
 */
@RestController
@RequestMapping
public class Testcontroller {

    @Autowired
    private SignMapper signMapper;

    @GetMapping(value = "/sign")
    @ResponseBody
    public Object listSign() {
        return signMapper.selectAll();
    }
}
