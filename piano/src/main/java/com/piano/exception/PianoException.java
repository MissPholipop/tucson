package com.piano.exception;

public class PianoException extends Exception {
	private String msg;
	public PianoException(String msg) {
		this.msg=msg;
	}

}
