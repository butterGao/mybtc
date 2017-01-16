package com.clevo.socket.service.iml;

import com.clevo.socket.service.WebSocketService;
import com.clevo.util.Logger;

/**
 * ^_^
 * Created by gaojiawei on 2017/1/9.
 */
public class OKcoinSocketImpl implements WebSocketService{
	Logger logger = Logger.getInstance (this.getClass ());
	@Override
	public void onReceive (String msg) {
		logger.info ("OKcoinSocketImpl.onReceive()-------------->>>>>" + msg);
	}
}
