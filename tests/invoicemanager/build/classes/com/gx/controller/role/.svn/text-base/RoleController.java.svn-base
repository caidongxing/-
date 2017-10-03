package com.gx.controller.role;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.Role.Role;
import com.gx.service.role.RoleService;

@Controller
@RequestMapping("/roleController")
public class RoleController extends BaseController{
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/list")
	public String findAll(){
		
		return "/role/role_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/role/role_add";
	}
	
	@RequestMapping("/save")
	public String saveRole(Role role){
		role.setCreater(1);
		role.setCreatetime(new Date());
		role.setfId(0);
		this.roleService.saveRole(role);
		return findAll();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Role role){
		role=this.roleService.findById(role.getId());
		request.setAttribute("roles", role);
		return "/role/role_update";
	}
	
	@RequestMapping("/update")
	public String updateRole(Role role){
		this.roleService.updateRole(role);
		return findAll();
	}
	
	@RequestMapping("/delete")
	public String deleteRole(Role role){
		this.roleService.deleteRole(role.getId());
		return findAll();
	}
	
	//=================begin-取得类型树=================
    //传入所有的列表节点
	private List<Role>  cTreeList(){
		List<Role> returnList = new ArrayList<Role>();
		List<Role> topList =new ArrayList<Role>();
		List<Role> tempList =new ArrayList<Role>();
		
		List<Role> aList =this.roleService.findAll();
		
		//筛选出顶级节点
		for(Role role:aList){
			if(role.getParent()==null){
				topList.add(role);//是顶级节点
			}else {
				tempList.add(role);//不是顶级节点
			}
		}
		
		//获取子级节点列表
		for(int i=0;i<topList.size();i++){
			Role role=topList.get(i);
			returnList.add(cTreeNode(role, "", (i+1<topList.size())));//添加自身
			
			//添加所有子级，自身如果不是顶级节点列表的最后一个前面用“│”打头，如果是则用“…”打头。
			returnList.addAll(cTreeNodeList(tempList,role.getId(),(i+1<topList.size())?"│":"…"));
		}
		return returnList;
	}
	
	/**
	  * 按照父节点取得所有子节点
	  * @inList 所有不是顶级节点的列表
	  * @parentid 顶级节点的id
	  * @headString 前缀字符
	  */
	
	private List<Role> cTreeNodeList(List<Role> inList,int parentid,String headString){
		List<Role> tempList1 = new ArrayList<Role>();
		List<Role> tempList2 = new ArrayList<Role>();
		List<Role> returnList = new ArrayList<Role>();
		
		//取得兄弟节点和不是兄弟节点
		 for(int i=0;i<inList.size();i++){
			 Role sacty = inList.get(i);
			 if(sacty.getParent().getId() == parentid){
				 tempList1.add(sacty);//兄弟节点
			 }else {
				 tempList2.add(sacty);//子节点
			 }
			 
		 }
		 
		 if(tempList1.size()>0){
			 for(int i=0;i<tempList1.size();i++){
			 Role sacty1 = tempList1.get(i);
			//返回列表添加自身
			 returnList.add(cTreeNode(sacty1, headString, (i+1<tempList1.size())));
			 
			//子节点个数不为0这递归这个方法。
			 if(tempList2.size()>0){
				 returnList.addAll(cTreeNodeList(tempList2,sacty1.getId(),headString+((i+1<tempList1.size())?"│":"…")));
			 }
		   }
		 }
		return returnList;
	}
	
	private Role cTreeNode(Role satcy,String headString,boolean havenext) {
		satcy.setRolename(headString.concat((havenext?"├":"└"))+satcy.getRolename());//添加本身，不是最末节点在前面添加"├"，只最末节点这添加"└"
		return satcy;
	}
	//=================end-取得类型树=================
}
