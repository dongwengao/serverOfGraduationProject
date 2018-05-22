package com.dwg.gp.dao;

import com.dwg.gp.bean.Dispatch;
import com.dwg.gp.bean.DispatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DispatchMapper {
    long countByExample(DispatchExample example);

    int deleteByExample(DispatchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dispatch record);

    int insertSelective(Dispatch record);

    List<Dispatch> selectByExample(DispatchExample example);

    List<Dispatch> selectAllDispatch();

    Dispatch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dispatch record, @Param("example") DispatchExample example);

    int updateByExample(@Param("record") Dispatch record, @Param("example") DispatchExample example);

    int updateByPrimaryKeySelective(Dispatch record);

    int updateByPrimaryKey(Dispatch record);

    List<Dispatch> selectDriverDispatch(int id);

    void updateAddendDateByMId(int id);

    void updateStartDate(int id);
}