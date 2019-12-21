package com.aaa.service;

import java.util.List;
import java.util.Map;

public interface DeptService {
    /**
     * 获取所有部门集合
     *
     * @param map
     * @return
     */
    List<Map> getList(Map map);


    /**
     * 根据id查找一个部门
     *
     * @param deptNo
     * @return
     */
    Map findOne(Integer deptNo);

    /**
     * 添加一个部门
     *
     * @param map
     * @return
     */
    int add(Map map);


    /**
     * 修改部门
     *
     * @param map
     * @return
     */
    int update(Map map);

    /**
     * 删除部门
     *
     * @param deptNo
     * @return
     */
    int del(Integer deptNo);
}
