package com.hj.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginImageValidateAction extends ActionSupport {
	
	private static final long serialVersionUID = -3693380773198312693L;
	private String codeNumber;//接收用户的输入的code
	private boolean ok=false;//用于json 接收
	
	public String getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	@Override
	public String execute() throws Exception {
		Map<String,Object> session = ActionContext.getContext().getSession();
		String snumber = (String)session.get("code");
		if((codeNumber).equals(snumber)){
			ok = true;
		}else{
			ok = false;
		}
		return this.SUCCESS;
	}
}
