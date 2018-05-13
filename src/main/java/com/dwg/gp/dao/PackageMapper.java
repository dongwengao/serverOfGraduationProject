package com.dwg.gp.dao;

import com.dwg.gp.bean.Package;
import com.dwg.gp.bean.PackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackageMapper {
    long countByExample(PackageExample example);

    int deleteByExample(PackageExample example);

    int deleteByPrimaryKey(Integer packageId);

    int insert(Package record);

    int insertSelective(Package record);

    List<Package> selectByExample(PackageExample example);

    Package selectByPrimaryKey(Integer packageId);

    int updateByExampleSelective(@Param("record") Package record, @Param("example") PackageExample example);

    int updateByExample(@Param("record") Package record, @Param("example") PackageExample example);

    int updateByPrimaryKeySelective(Package record);

    int updateByPrimaryKey(Package record);
}