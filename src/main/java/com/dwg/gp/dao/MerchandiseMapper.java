package com.dwg.gp.dao;

import com.dwg.gp.bean.Merchandise;
import com.dwg.gp.bean.MerchandiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchandiseMapper {
    long countByExample(MerchandiseExample example);

    int deleteByExample(MerchandiseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Merchandise record);

    int insertSelective(Merchandise record);

    List<Merchandise> selectByExample(MerchandiseExample example);

    Merchandise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Merchandise record, @Param("example") MerchandiseExample example);

    int updateByExample(@Param("record") Merchandise record, @Param("example") MerchandiseExample example);

    int updateByPrimaryKeySelective(Merchandise record);

    int updateByPrimaryKey(Merchandise record);
}