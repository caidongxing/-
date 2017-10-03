package org.crazyit.app.service.impl;

import org.crazyit.app.service.MyService;

public class MyServiceImpl implements MyService {

	@Override
	public int validLogin(String name, String pass) {
		if(name.equals("admin")&&pass.equals("admin")){
			return 100;
		}
		return -1;
	}

}
