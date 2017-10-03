package com.gx.controller.system_maintenance.data_migration_tool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;

@Controller
@RequestMapping("/datamigrationController")
public class DatamigrationController extends BaseController{

	@RequestMapping("/transfer")
	public String transfer(){
		
		return "/system_maintenance/data_migration_tool/transfer";
	}
}
