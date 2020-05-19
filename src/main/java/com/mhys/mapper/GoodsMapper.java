package com.mhys.mapper;

import com.mhys.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    List<User> findAllGoods();
    int delByidGoods(int id);
}
