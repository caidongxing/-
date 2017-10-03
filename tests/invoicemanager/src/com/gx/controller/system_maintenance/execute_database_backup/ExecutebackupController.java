package com.gx.controller.system_maintenance.execute_database_backup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;

@Controller
@RequestMapping("/executebackupController")
public class ExecutebackupController extends BaseController{

	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/receive/receive_list";
	}
}
