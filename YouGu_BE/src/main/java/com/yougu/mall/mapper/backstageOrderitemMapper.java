package com.yougu.mall.mapper;

import com.yougu.mall.entity.Orderitem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface backstageOrderitemMapper {

    List<Orderitem> queryByAll();
}
