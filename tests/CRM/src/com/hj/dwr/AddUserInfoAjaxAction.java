package com.hj.dwr;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import com.hj.entity.RoleInfo;
import com.hj.entity.RoleRelationship;
import com.hj.entity.UserInfo;
import com.hj.service.RoleInfoService;
import com.hj.service.RoleRelationshipService;
import com.hj.service.UserInfoService;
import com.hj.util.MD5Util;

public class AddUserInfoAjaxAction {

	private UserInfoService userInfoService;
	private RoleInfoService roleInfoService;
	private RoleRelationshipService roleRelationshipService;
	
	
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public RoleInfoService getRoleInfoService() {
		return roleInfoService;
	}

	public void setRoleInfoService(RoleInfoService roleInfoService) {
		this.roleInfoService = roleInfoService;
	}
	
public RoleRelationshipService getRoleRelationshipService() {
		return roleRelationshipService;
	}

	public void setRoleRelationshipService(
			RoleRelationshipService roleRelationshipService) {
		this.roleRelationshipService = roleRelationshipService;
	}

/***
 * 保存用户信息
 * **/
	@SuppressWarnings("unchecked")
	public String saveUserInfo(Map user) throws Exception{
		
		String userName=(String) user.get("userName");
		String userLoginName=(String) user.get("userLoginName");
		String userPassWord=(String) user.get("userPassWord");
		String reUserPassWord=(String) user.get("reUserPassWord");
		String userTelphone=(String) user.get("userTelphone");
		String userEmail=(String) user.get("userEmail");
		
		//如果上级没有领导就设置为0；
		//Integer userLeadId= Integer.parseInt(user.get("userLeadId").toString()) ;
		Integer userLeadId;
		if(user.get("userLeadId")==null || "".equals(user.get("userLeadId"))){
			userLeadId=0;
		}else{
			userLeadId=Integer.parseInt(user.get("userLeadId").toString()) ;
		}
		Integer roleInfoId= Integer.parseInt(user.get("roleInfoId").toString());
		/*System.out.println(userName);
		System.out.println(userLoginName);
		System.out.println(userPassWord);
		System.out.println(reUserPassWord);
		System.out.println(userTelphone);
		System.out.println(userEmail);
		System.out.println(roleInfoId);*/
		
		
		//判断用户登录名是否重复
		String str="";
		if(userInfoService.findUserLoginName(userLoginName).size()!=0){
			str="用户登录名已经存在！";
			
		}else{
			//判断密码和确认密码是否相同
			if(userPassWord!=null && reUserPassWord!=null && userPassWord.equals(reUserPassWord)){
             //保存操作信息
				UserInfo userInfo=new UserInfo();
					userInfo.setUserName(userName);
					userInfo.setUserLoginName(userLoginName);
					userInfo.setUserPassWord(MD5Util.getMD5(userPassWord));
					userInfo.setUserTelphone(userTelphone);
					userInfo.setUserEmail(userEmail);
					//userInfo.setUserLeadId(userLeadId);
					//设置上级id ，一对多、多对一关系 
					if(userLeadId!=0){
						UserInfo lead=new UserInfo();
						lead.setUserId(userLeadId);
						userInfo.setUserInfo(lead);
					}
					RoleInfo roleId = roleInfoService.findByRoleInfoId(roleInfoId);
				    userInfo.setRoleInfo(roleId);
				userInfoService.saveUserInfo(userInfo);
				str="用户信息保存成功！";
			}else{
				str="密码和确认密码不一致！";
			}
			
		}
		return str;
	}
	
	
	/***
	 * 更新用户信息
	 * **/
		@SuppressWarnings("unchecked")
		public String updateUserInfo(Map user) throws Exception{
			//接收用户ID过来
			//1.可以接收触发事件添加用户id发送过来过来 
			//2.可以做个隐藏域，发送过来，它们接收方法一样
			Integer userId=Integer.parseInt(user.get("userId").toString());// 将用户Id隐藏域发送过去 接收
			UserInfo oldUserName=userInfoService.findUserId(userId);
			String oldUserLoginName=oldUserName.getUserLoginName();
			String userName=(String) user.get("userName");
			String userLoginName=(String) user.get("userLoginName");
			String userPassWord=(String) user.get("userPassWord");
			String reUserPassWord=(String) user.get("reUserPassWord");
			String userTelphone=(String) user.get("userTelphone");
			String userEmail=(String) user.get("userEmail");
			
			System.out.println("=================================================");
			System.out.println(userId);
			System.out.println(oldUserName);
			System.out.println(oldUserLoginName);
			System.out.println(userLoginName);
			
			
			
			//如果上级没有领导就设置为0；
			//Integer userLeadId= Integer.parseInt(user.get("userLeadId").toString()) ;
			Integer userLeadId;
			if(user.get("userLeadId")==null || "".equals(user.get("userLeadId"))){
				userLeadId=0;
			}else{
				userLeadId=Integer.parseInt(user.get("userLeadId").toString()) ;
			}
			Integer roleInfoId= Integer.parseInt(user.get("roleInfoId").toString());
			
			
			//判断用户登录名是否重复
			String str="";
			//1.判断用户登录名是不是重复，如果修改的用户名和以前的用户名相同的话，则可以通过，也就是不显示被占用。
			if(userInfoService.findUserLoginName(userLoginName).size()!=0 && !userLoginName.equals(oldUserLoginName)){
				str="用户登录名已经存在！";
				
			}else{
				//判断密码和确认密码是否相同
				if(userPassWord!=null && reUserPassWord!=null && userPassWord.equals(reUserPassWord)){
	             //保存操作信息
					UserInfo userInfo=new UserInfo();
					    userInfo.setUserId(userId);//将用户Id加入
						userInfo.setUserName(userName);
						userInfo.setUserLoginName(userLoginName);
						userInfo.setUserPassWord(MD5Util.getMD5(userPassWord));
						userInfo.setUserTelphone(userTelphone);
						userInfo.setUserEmail(userEmail);
						//userInfo.setUserLeadId(userLeadId);
						//设置上级id ，一对多、多对一关系 
						if(userLeadId!=0){
							UserInfo lead=new UserInfo();
							lead.setUserId(userLeadId);
							userInfo.setUserInfo(lead);
						}
						RoleInfo roleId = roleInfoService.findByRoleInfoId(roleInfoId);
					    userInfo.setRoleInfo(roleId);
					userInfoService.updateUserInfo(userInfo);
					str="用户信息更新成功！";
				}else{
					str="密码和确认密码不一致！";
				}
				
			}
			return str;
		}
		
		/***
		 * 删除用户信息
		 * **/
			@SuppressWarnings("unchecked")
			public String deleteUserInfo(Integer userId) throws Exception{
				
				UserInfo userInfo=userInfoService.findUserId(userId);
				Set<UserInfo> leaddowns=userInfo.getUserInfos();
				//判断用是否存在下级
				if(leaddowns.size()!=0){
					//如果存在下级，将所有下级设置为空
					for(UserInfo leaddown:leaddowns){
						//将下级的上级设置为空，然后更新下级
						leaddown.setUserInfo(null);
						userInfoService.updateUserInfo(leaddown);
					}
				}
				userInfoService.deleteUserId(userId);
				String str="注销用户成功！";
				return str;
			}
			
			
			/***
			 * 批量删除用户信息
			 * **/
			public String deleteUserInfoBatch(Integer[] userIds) throws Exception{
				for(Integer userId:userIds){
					this.deleteUserInfo(userId);//调用上面的删除方法
				}
				String str="批量注销用户成功！";
				return str;
			}
			
			
			

			/***
			 * 用户名登录
			 * @throws Exception 
			 * **/
				@SuppressWarnings("unchecked")
				public String userLogin(Map userMap,HttpSession session) throws Exception {
					String userLoginName=userMap.get("userLoginName").toString();
					String userPassWord=userMap.get("userPassWord").toString();
					String codeNumber=userMap.get("codeNumber").toString();
					String str="";
					if(userLoginName==null || "".equals(userLoginName)){
						str+="登录名不能为空！\n";
					}
					if(userPassWord==null ||  "".equals(userPassWord) ){
						str+="密码不能为空！\n";
					}
					if(codeNumber==null ||  "".equals(codeNumber) ){
						str+="验证码不能为空！\n";
					}
			
					if(userLoginName!=null &&  !"".equals(userLoginName) && userPassWord!=null &&  !"".equals(userPassWord)  && codeNumber!=null &&  !"".equals(codeNumber)){
						       //获取验证码
						       String code= (String) session.getAttribute("code");
						       //判断验证码输入是否正确
						       if(!code.equals(codeNumber)){
						    	   str+="验证码输入不正确！\n";
						       }else{
						    	   //用户名是否存在
						    	   List<UserInfo> userLoginNames=userInfoService.findUserLoginName(userLoginName);
						    	   if(userLoginNames.size()==0){
						    		   str+="登录名不存在！\n";
						    	   }else{
						    		   //判断密码输入是否正确
						    		   UserInfo  userInfo=userLoginNames.get(0);
						    		   if(!MD5Util.getMD5(userPassWord).equals(userInfo.getUserPassWord())){
						    			   str+="密码不正确！\n";
						    		   }else{
						    			   //登录成功
						    			   session.setAttribute("userLoginNames", userLoginName);//这个关于过滤器方面的LoginFilter.java关联
						    			   //获得该用户得分权限
						    			   RoleInfo roleInfo=userInfo.getRoleInfo();
						    			   //获取角色权限信息
						    			   List<RoleRelationship> roleRelationship=roleRelationshipService.findByRoleRelationship(roleInfo);
						    			   session.setAttribute("roleRelationship", roleRelationship);
                                       }
						    	    }
						       }
					}
					return str;
				}
}
