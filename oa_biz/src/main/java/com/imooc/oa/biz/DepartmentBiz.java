package com.imooc.oa.biz;

import com.imooc.oa.entity.Department;

import java.util.List;

/**
 * @author Sidney 2018-12-18.
 */
public interface DepartmentBiz {
    void add(Department department);
    void edit(Department department);
    void remove(String sn);
    Department get(String sn);
    List<Department> getAll();
}
