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

    int insertForId(Merchandise merchandise);

    void updateByMerchandise(Merchandise merchandise);

    List<Merchandise> selectAllByShoudendPointId(int shouldendpoint);

    void updateByMerchandiseForState(int id);

    List<Merchandise> selectAll();

    List<Merchandise> selectAllNeedDispatche();

    List<Merchandise> selectMerchandiseByPId(int id);

    void updateDispatchedState(int id);

    void updateForQrCode(int merchandiseId, byte[] bytes);
}