package com.shard.mapper;

import org.apache.ibatis.annotations.Param;

import com.shard.domain.DetailOrderVO;

public interface OrdersMapper {

	public void orderInsert(@Param("totalPrice")int totalPrice, @Param("email")String email);
	public void detailOrderInsert(DetailOrderVO dvo);
	public void getCustomer(String email);
	}