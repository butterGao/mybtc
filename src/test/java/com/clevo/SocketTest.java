package com.clevo;


import com.clevo.socket.client.OKclient;
import com.clevo.socket.service.WebSocketService;
import com.clevo.socket.service.iml.OKcoinSocketImpl;

/**
 * ^_^
 * Created by gaojiawei on 2017/1/11.
 */
public class SocketTest {
	public static void main (String[] args) {
		String apiKey = "";
		// secretKey为用户申请的secretKey
		String secretKey = "";
		apiKey = "fe631865-6b8d-430c-a1c7-0c77bce0f2c9";
		secretKey = "11F38E6EE8B203A56BD05A2338F7814F";
		String url = "wss://real.okcoin.cn:10440/websocket/okcoinapi";

		// 订阅消息处理类,用于处理WebSocket服务返回的消息
		WebSocketService socketService=new OKcoinSocketImpl ();
		OKclient client = new OKclient(url, socketService);
		client.start();
		client.addChannel ("ok_sub_spotcny_btc_ticker");
	}
}
