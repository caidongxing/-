package com.gx.controller.system_maintenance.change_number;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;

@Controller
@RequestMapping("/changenumberController")
public class ChangenumberController extends BaseController{

	@RequestMapping("/transfer")
	public String transfer(){
		
		return "/system_maintenance/change_number/transfer";
	}
}
