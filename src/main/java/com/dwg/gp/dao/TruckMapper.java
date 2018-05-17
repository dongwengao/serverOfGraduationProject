package com.dwg.gp.dao;

import com.dwg.gp.bean.Truck;
import com.dwg.gp.bean.TruckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TruckMapper {
    long countByExample(TruckExample example);

    int deleteByExample(TruckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Truck record);

    int insertSelective(Truck record);

    List<Truck> selectByExample(TruckExample example);

    Truck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Truck record, @Param("example") TruckExample example);

    int updateByExample(@Param("record") Truck record, @Param("example") TruckExample example);

    int updateByPrimaryKeySelective(Truck record);

    int updateByPrimaryKey(Truck record);

    List<Truck> seleckAllTruck();

    List<Truck> selectUseTruck();
}