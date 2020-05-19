package com.mhys.service;

import com.mhys.mapper.GoodsMapper;
import com.mhys.mapper.UserMapper;
import com.mhys.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    public List<User> findAllGoods() {
        return goodsMapper.findAllGoods();
    }

    public int delByidGoods(int id) {

        return goodsMapper.delByidGoods(id);
    }
}
