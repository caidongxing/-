package com.hj.dwr;

import java.util.List;

import com.hj.entity.MenuInfo;
import com.hj.entity.RoleInfo;
import com.hj.entity.RoleRelationship;
import com.hj.service.RoleInfoService;
import com.hj.service.RoleRelationshipService;

public class AddRoleInfoAjaxAction {
	
	
	private RoleInfoService roleInfoService;
	private RoleRelationshipService roleRelationshipService;
	
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

/****
 * 总结：
 * 一步：添加角色名称；
 * 二步：判断角色名称是否为重复；
 * 三步：设置访问权限初始化为0；
 * 四步：根据菜单栏里的栏目，判断id  
 * **/
/**
 * 业务逻辑：
 * 1.角色添加  角色名称添加，判断角色是否有重复，没有可以添加，有，提示不能添加
 * 2.角色关系  将其关系角色id添加 ，是否可以访问，初始化是0，
 * 3.菜单添加  将菜单id添加
 * 总之，将三个添加到角色关系信息表里面
 * 
 * */
	public String saveRoleInfo (String roleName,Integer[] menuInfoIds){
		String str;
       if(roleInfoService.findByRoleName(roleName).size()==0){
			RoleInfo roleInfo=new RoleInfo();
			roleInfo.setRoleName(roleName);
			roleInfoService.saveRole(roleInfo);
			for(int i=0;i<7;i++){
				RoleRelationship roleRelationship=new RoleRelationship();
				roleRelationship.setRoleInfo(roleInfo);
				   //roleRelationship.setMenuInfo(menuInfo);
					MenuInfo menuInfo=new MenuInfo();
					menuInfo.setMenuInfoId(i+1);//从1开始
					roleRelationship.setMenuInfo(menuInfo);
				roleRelationship.setAccess(0);
				
				/**将角色加入时，设置角色访问权限设置*/
				for(Integer menuInfoId:menuInfoIds){
					if(i+1==menuInfoId){
						roleRelationship.setAccess(1);
						break;
					}
				}
				roleRelationshipService.saveRoleRelationship(roleRelationship);
			};
			
			
			str="角色添加成功！";
		}else{
			str="角色已经存在,不能再添加！";
		}
		
		return str;
	}
	
	/***
	 * 修改角色信息
	 * **/
	public String updateRoleInfo (Integer roleId,Integer[] menuInfoIds){
		String str;
		RoleInfo roleInfo=roleInfoService.findByRoleInfoId(roleId);
		/** 查到该所有的权限信息*/
		List<RoleRelationship> roleRelationship=roleRelationshipService.findByRoleRelationship(roleInfo);
			for(int i=0;i<roleRelationship.size();i++){
				/**设置初始化权限为0**/
				roleRelationship.get(i).setAccess(0);
				/**将角色修改时，设置角色访问权限设置*/
				for(Integer menuInfoId:menuInfoIds){
					if(i+1==menuInfoId){
						/**设置为1*/
						roleRelationship.get(i).setAccess(1);
						break;
					}
				}
				roleRelationshipService.updateRoleRelationship(roleRelationship.get(i));
			};
			str="角色更新成功！";
				
		return str;
	}
	public String deleteRoleInfo(Integer roleId){
		
		//先通过角色id找到角色
		RoleInfo roleInfo=roleInfoService.findByRoleInfoId(roleId);
		
		//再通过角色找到对应的权限
		List<RoleRelationship> roleRelationships=roleRelationshipService.findByRoleRelationship(roleInfo);
		
		//首先删除该权限信息
		for(RoleRelationship roleRelationship:roleRelationships){
			roleRelationshipService.deleteRoleRelationship(roleRelationship);
		}
		//然后再删除该角色
		roleInfoService.deleteRoleInfo(roleInfo);
		String str="删除角色成功！";
		return str;
	}
	
	//批量删除角色
	public String deleteRoleInfoBatch(Integer[] roleIds){
		for(Integer roleId:roleIds ){
			//先通过角色id找到角色
			RoleInfo roleInfo=roleInfoService.findByRoleInfoId(roleId);
			
			//再通过角色找到对应的权限
			List<RoleRelationship> roleRelationships=roleRelationshipService.findByRoleRelationship(roleInfo);
			
			//首先删除该权限信息
			for(RoleRelationship roleRelationship:roleRelationships){
				roleRelationshipService.deleteRoleRelationship(roleRelationship);
			}
			//然后再删除该角色
			roleInfoService.deleteRoleInfo(roleInfo);
		}
		String str="批量删除角色成功！";
		return str;
	}
}
