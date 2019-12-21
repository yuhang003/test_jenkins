package com.aaa.controller;

import com.aaa.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;


    @RequestMapping("list")
    public Object list(@RequestParam Map map) {
        return deptService.getList(map);
    }

    @RequestMapping("findOne")
    public Object findOne(Integer deptNo) {
        return deptService.findOne(deptNo);
    }


    @RequestMapping("add")
    public Object add(@RequestParam Map map) {
        return deptService.add(map);
    }


    @RequestMapping("update")
    public Object update(@RequestParam Map map) {
        return deptService.update(map);
    }


    @RequestMapping("del")
    public Object del(Integer deptNo) {
        return deptService.del(deptNo);
    }

    @RequestMapping("show")
    public String show() {
        return "hello SpringBoot";
    }
}
