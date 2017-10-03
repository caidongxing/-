package com.gx.controller.equipment_management.equipment_clock_setting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;

@Controller
@RequestMapping("/clocksettingController")
public class ClocksettingController extends BaseController{

	@RequestMapping("/clocksetting")
	public String clocksetting(){
		
		return "/equipment_management/equipment_clock_setting/clocksetting";
	}
}
