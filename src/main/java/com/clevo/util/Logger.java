package com.clevo.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * ^_^
 * Created by gaojiawei on 2017/1/11.
 */
public class Logger {
	private static ConcurrentMap<String, Logger> loggers = new ConcurrentHashMap<String, Logger> ();
	private final String LOG_ERROR = "LOG_ERROR";
	private final String LOG_INFO = "LOG_INFO";
	private String name;

	Logger (String name) {
		this.name = name;
	}

	public static Logger getInstance (String name) {
		Logger newInstance = loggers.get (name);
		if (newInstance == null) {
			newInstance = new Logger (name);
			Logger oldInstance = loggers.putIfAbsent (name, newInstance);
			return oldInstance == null ? newInstance : oldInstance;
		}
		return newInstance;
	}

	public static Logger getInstance (Class name) {
		return getInstance (name.getName ());
	}

	public void info (String msg) {
		push (msg, LOG_INFO);
	}

	public void info (String msg, Exception e) {
		push (msg, e, LOG_INFO);
	}

	public void error (String msg) {
		push (msg, LOG_ERROR);
	}


	public void error (String msg, Exception e) {
		push (msg, e, LOG_ERROR);
	}

	public void debug (String msg, Exception e) {
		push (msg, e, LOG_ERROR);
	}
	public void debug (String msg) {
		push (msg, LOG_ERROR);
	}

	private void push (String msg, Exception e, String type) {
		e.printStackTrace ();
		;
		switch (type) {
			case LOG_ERROR:
				System.out.println (name + LOG_ERROR + " : " + msg + ":  " + e.toString ());
			case LOG_INFO:
				System.out.println (name + LOG_INFO + " : " + msg + ":  " + e.toString ());
		}
	}

	private void push (String msg, String type) {
		switch (type) {
			case LOG_ERROR:
				System.out.println (name + LOG_ERROR + " : " + msg);
			case LOG_INFO:
				System.out.println (name + LOG_INFO + " : " + msg);
		}
	}
}
