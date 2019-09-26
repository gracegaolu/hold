package com.example.core.dao;

import com.example.core.model.StatYearPv;
import com.example.core.model.StatYearPvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatYearPvMapper {
    long countByExample(StatYearPvExample example);

    int deleteByExample(StatYearPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatYearPv record);

    int insertSelective(StatYearPv record);

    List<StatYearPv> selectByExample(StatYearPvExample example);

    StatYearPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatYearPv record, @Param("example") StatYearPvExample example);

    int updateByExample(@Param("record") StatYearPv record, @Param("example") StatYearPvExample example);

    int updateByPrimaryKeySelective(StatYearPv record);

    int updateByPrimaryKey(StatYearPv record);
}