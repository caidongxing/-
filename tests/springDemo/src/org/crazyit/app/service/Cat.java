package org.crazyit.app.service;

public class Cat implements Being {
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void testBeing() {
		System.out.println(msg+",√®¿¥¡À");
	}

}
