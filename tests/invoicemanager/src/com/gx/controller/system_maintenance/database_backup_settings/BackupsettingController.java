package com.gx.controller.system_maintenance.database_backup_settings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;

@Controller
@RequestMapping("/backupsettingController")
public class BackupsettingController extends BaseController{
	
	@RequestMapping("/backupsetting")
	public String backupsetting(){
		
		return "/system_maintenance/database_backup_settings/backupsetting";
	}
}
