package com.clevo.socket.task;

import com.clevo.socket.client.WebSocketBase;
import com.clevo.util.Logger;

import java.util.TimerTask;

public class MoniterTask extends TimerTask {

	private Logger log = Logger.getInstance (WebSocketBase.class);
	private long startTime = System.currentTimeMillis ();
	private int checkTime = 5000;
	private WebSocketBase client = null;

	public MoniterTask (WebSocketBase client, Integer checkTime) {
		this.client = client;
		this.checkTime = checkTime;
		// log.info("TimerTask is starting.... ");
	}

	public void updateTime () {
		// log.info("startTime is update");
		startTime = System.currentTimeMillis ();
	}

	public void run () {
		if (System.currentTimeMillis () - startTime > checkTime) {
			client.setStatus (false);
			// log.info("Moniter reconnect....... ");
			client.reConnect ();
		}
		client.sentPing ();
		// log.info("Moniter ping data sent.... ");

	}
}