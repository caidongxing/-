package org.crazyit.app.action;

import org.crazyit.app.service.MyService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String userpass;
	private MyService ms;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public void setMs(MyService ms) {
		this.ms = ms;
	}
	public String execute() throws Exception{
		if(ms.validLogin(getUsername(), getUserpass())>0){
			addActionMessage("整合成功了，厉害吧");
			return SUCCESS;
		}
		return ERROR;
	}
}
