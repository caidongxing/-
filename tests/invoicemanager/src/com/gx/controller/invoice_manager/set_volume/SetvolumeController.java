package com.gx.controller.invoice_manager.set_volume;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;

@Controller
@RequestMapping("/setvolumeController")
public class SetvolumeController extends BaseController{

	@RequestMapping("/set_volume")
	public String set_volume(){
		return "/invoice_manager/set_volume/specifications_update";
	}
}
