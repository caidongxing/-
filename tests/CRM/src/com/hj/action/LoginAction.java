package com.hj.action;

import java.util.List;
import java.util.Map;

import com.hj.entity.UserInfo;
import com.hj.service.UserInfoService;
import com.hj.util.MD5Util;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3084293305536377421L;
	private String userLoginName;
	private String userPassWord;
	private String codeNumber;
	private UserInfoService userInfoService;
	
	

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserPassWord() {
		return userPassWord;
	}

	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}

	public String getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}
   //数据校验：是对用户输入是否的合法 规矩
	public void validate() {
		if(userLoginName==null ||  "".equals(userLoginName) ){
			this.addActionError("登录名不能为空！");
		}
		if(userPassWord==null ||  "".equals(userPassWord) ){
			this.addActionError("密码不能为空！");
		}
		if(codeNumber==null ||  "".equals(codeNumber) ){
			this.addActionError("验证码不能为空！");
		}
	}

	@Override
	public String execute() throws Exception {
       Map session=ActionContext.getContext().getSession();
       //获取验证码
       String code=(String) session.get("code");
       //判断验证码输入是否正确
       if(!code.equals(codeNumber)){
    	   this.addActionError("验证码输入不正确！");
    	   return this.INPUT;
       }else{
    	   //用户名是否存在
    	   List<UserInfo> userLoginNames=userInfoService.findUserLoginName(userLoginName);
    	   if(userLoginNames.size()==0){
    		   this.addActionError("用户不存在！");
        	   return this.INPUT;
    	   }else{
    		   //判断密码输入是否正确
    		   UserInfo  userLogin=userLoginNames.get(0);
    		   if(!MD5Util.getMD5(userPassWord).equals(userLogin.getUserPassWord())){
    			   System.out.println(MD5Util.getMD5(userPassWord));
    			   System.out.println(userLogin.getUserPassWord());
    			   this.addActionError("密码输入不正确！");
            	   return this.INPUT;
    		   }
    	   }
       }
       session.put("userLoginNames", userLoginName);//这个关于过滤器方面的LoginFilter.java关联
       return this.SUCCESS;
	}
}
