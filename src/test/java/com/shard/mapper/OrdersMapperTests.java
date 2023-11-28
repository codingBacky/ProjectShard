package com.shard.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shard.domain.DetailOrderVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class OrdersMapperTests {
	
	@Autowired
	private OrdersMapper mapper;

	@Test
	public void orderInsert() {
		mapper.orderInsert(10000, "email14@gmail.com");
	}
	@Test
	public void detailOrderInsert() {
		DetailOrderVO dvo = DetailOrderVO.builder()
				.itemNum(1)
				.cnt(2)
				.orderId(1)
				.size("S")
				.build();
				
		mapper.detailOrderInsert(dvo);
	}
	
}
