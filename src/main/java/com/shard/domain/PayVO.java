package com.shard.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayVO {
	
	private int payNum;
	
	private int orderId;
	
	private String email;
	
	private String payTotal;
	
	private String payMethod;
	
	private String payComplete;
	
	private Date payDate;
	
	
}	
	
