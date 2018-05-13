package com.dwg.gp.dao;

import com.dwg.gp.bean.Dispatcher;
import com.dwg.gp.bean.DispatcherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DispatcherMapper {
    long countByExample(DispatcherExample example);

    int deleteByExample(DispatcherExample example);

    int insert(Dispatcher record);

    int insertSelective(Dispatcher record);

    List<Dispatcher> selectByExample(DispatcherExample example);

    int updateByExampleSelective(@Param("record") Dispatcher record, @Param("example") DispatcherExample example);

    int updateByExample(@Param("record") Dispatcher record, @Param("example") DispatcherExample example);
}