package com.clevo.socket.bean;

import java.math.BigDecimal;
import java.security.Timestamp;

/**
 * ^_^
 * Created by gaojiawei on 2017/1/9.
 *okcoin的实时交易数据
 */
public class okticker {
//	buy: 买一价
//	high: 最高价
//	last: 最新成交价
//	low: 最低价
//	sell: 卖一价
//	timestamp：时间戳
//	vol: 成交量(最近的24小时)
	private BigDecimal buy;
	private BigDecimal high;
	private BigDecimal last;
	private BigDecimal low;
	private BigDecimal sell;
	private Timestamp timestamp;
	private BigDecimal vol;

	public BigDecimal getBuy () {
		return buy;
	}

	public void setBuy (BigDecimal buy) {
		this.buy = buy;
	}

	public BigDecimal getHigh () {
		return high;
	}

	public void setHigh (BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getLast () {
		return last;
	}

	public void setLast (BigDecimal last) {
		this.last = last;
	}

	public BigDecimal getLow () {
		return low;
	}

	public void setLow (BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getSell () {
		return sell;
	}

	public void setSell (BigDecimal sell) {
		this.sell = sell;
	}

	public Timestamp getTimestamp () {
		return timestamp;
	}

	public void setTimestamp (Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public BigDecimal getVol () {
		return vol;
	}

	public void setVol (BigDecimal vol) {
		this.vol = vol;
	}
}
