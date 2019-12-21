package com.aaa.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface DeptDao {

    /**
     * 获取所有部门集合
     *
     * @param map
     * @return
     */
    @Select("<script>select * from dept <where>" +
            "<if test='deptName != null'> dname like '%${deptName}%' </if>" +
            "<if test='loc != null'> loc like '%${loc}%'</if>" +
            "</where></script>")
    List<Map> getList(Map map);


    /**
     * 根据id查找一个部门
     *
     * @param deptNo
     * @return
     */
    @Select("select * from dept where deptno = #{deptNo}")
    Map findOne(Integer deptNo);

    /**
     * 添加一个部门
     *
     * @param map
     * @return
     */
    @Insert("insert into dept values(seq_news_id.nextval,#{deptName},#{loc})")
    int add(Map map);


    /**
     * 修改部门
     *
     * @param map
     * @return
     */
    @Update("update dept set dname = #{deptName},loc = #{loc} where deptno = #{deptNo}")
    int update(Map map);

    /**
     * 删除部门
     *
     * @param deptNo
     * @return
     */
    @Delete("delete from dept where deptno = #{deptId}")
    int del(Integer deptNo);
}
