package com.example.core.dao;

import com.example.core.model.SitePv;
import com.example.core.model.SitePvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SitePvMapper {
    long countByExample(SitePvExample example);

    int deleteByExample(SitePvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SitePv record);

    int insertSelective(SitePv record);

    List<SitePv> selectByExample(SitePvExample example);

    SitePv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SitePv record, @Param("example") SitePvExample example);

    int updateByExample(@Param("record") SitePv record, @Param("example") SitePvExample example);

    int updateByPrimaryKeySelective(SitePv record);

    int updateByPrimaryKey(SitePv record);
}