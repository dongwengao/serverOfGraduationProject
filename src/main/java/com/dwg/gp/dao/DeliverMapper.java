package com.dwg.gp.dao;

import com.dwg.gp.bean.Deliver;
import com.dwg.gp.bean.DeliverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverMapper {
    long countByExample(DeliverExample example);

    int deleteByExample(DeliverExample example);

    int insert(Deliver record);

    int insertSelective(Deliver record);

    List<Deliver> selectByExample(DeliverExample example);

    int updateByExampleSelective(@Param("record") Deliver record, @Param("example") DeliverExample example);

    int updateByExample(@Param("record") Deliver record, @Param("example") DeliverExample example);

    void updateDeliverStateForDispatched(int id);
}