package cn.yunhe.mapper;

import cn.yunhe.entity.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpMapper {

    @Select("select * from emp e,dept d where e.deptno=d.deptno and e.deptno=#{deptno}")
    List<Emp> findEmp(Integer deptno);
}
