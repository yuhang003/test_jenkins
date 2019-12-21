package com.aaa.service.impl;

import com.aaa.dao.DeptDao;
import com.aaa.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Map> getList(Map map) {
        return deptDao.getList(map);
    }

    @Override
    public Map findOne(Integer deptNo) {
        return deptDao.findOne(deptNo);
    }

    @Override
    public int add(Map map) {
        return deptDao.add(map);
    }

    @Override
    public int update(Map map) {
        return deptDao.update(map);
    }

    @Override
    public int del(Integer deptNo) {
        return deptDao.del(deptNo);
    }
}
