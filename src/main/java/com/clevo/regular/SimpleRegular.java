package com.clevo.regular;

import java.math.BigDecimal;

/**
 * ^_^
 * Created by gaojiawei on 2017/1/16.
 * 交易规则
 */
public class SimpleRegular implements Regular{


	@Override
	/**
	 * 获取可购买价格
	 */
	public BigDecimal getBuyPrice () {
		return null;
	}

	@Override
	/**
	 * 得到可出售价格
	 */
	public BigDecimal getSellPrice () {
		return null;
	}
}
